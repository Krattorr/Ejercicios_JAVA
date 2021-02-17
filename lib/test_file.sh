#! /bin/bash
# Aquest programa realitza els tests d'E/S d'un exercici
# Considera com a entrada els arguments per entrada estàndard
# Pot col·locar un o més fitxers de text per realitzar les proves

# $1 contains the name of the program under test
# $2 contains the folder with the tests

if [ -z "$1" ] || [ -z "$2" ];
then
    echo "Ús: $0 NomDelProgramaATestejar NomDeLaCarpetaAmbElsTests"
    exit 1
fi

# copy file-ins $1 onto destfolder $2
function cp_filein() {
    filesin=$1
    destfolder=$2
    if compgen -G "$filesin"* > /dev/null; then
        for filein in "$filesin"*;
        do
            fileinname=$(basename -- "$filein")
            fileindest=${fileinname#*_}
            cp "$filein" "$destfolder/$fileindest"
        done
    fi
}

# remove given input files from current folder
function rm_filein() {
    filesin=$1
    destfolder=$2
    if compgen -G "$filesin"* > /dev/null; then
        for filein in "$filesin"*;
        do
            fileinname=$(basename -- "$filein")
            rm -f "${fileinname#*_}"
        done
    fi
}

# remopve preexisting output files from current folder
function rm_fileout() {
    outputprefix=$1
    if compgen -G "$outputprefix"* > /dev/null; then
        for fileout in "$outputprefix"*;
        do
            fileoutname=$(basename -- "$fileout")
            rm -f "${fileoutname#*_}"
        done
    fi
}

# Display the stdout difference
function display_stdout_difference() {
    testid=$1
    giveninput=$2
    expected=$3
    studentresult=$4
    difference=$5
    echo "Test nr. $testid: Errors"
    if [ -s "$giveninput" ]; 
    then
        echo
        echo "Entrada"
        echo "-------"
        cat "$giveninput"
        echo
    fi
    echo
    echo "Sortida esperada"
    echo "----------------"
    cat "$expected"
    echo; echo
    echo "Sortida trobada"
    echo "---------------"
    cat "$studentresult"
    echo; echo
    echo "Diferència"
    echo "----------"
    cat "$difference"
    echo
}

# Display the output file difference
function display_output_difference() {
    testid=$1
    studentresult=$2
    expected=$3
    difference=$4
    echo "Test nr. $testid: Errors"
    echo
    echo "Fitxer de sortida"
    echo "-----------------"
    if [ -f "$studentresult"  ];
    then
        echo "$studentresult"
        echo; echo
        echo "Contingut esperat"
        echo "-----------------"
        cat "$expected"
        echo; echo
        echo "Contingut trobat"
        echo "----------------"
        cat "$studentresult"
        echo; echo
        echo "Diferència"
        echo "----------"
        cat "$difference"
        echo
    else
        echo "No s'ha trobat el fitxer $studentresult"
    fi
}

# name parameters
program=$(basename "$1")
test_folder="$2"
diffoptions=${INTROPRG_DIFFOPTIONS:-"-EZbB"}

# create temporary folder
tmpfolder=$(mktemp -d -t ies_$program"_XXXXXXXXXXX")
tmpfile="$tmpfolder/__result"
tmpdiff="$tmpfolder/__difference"

# copy student's files
cp -r ./* "$tmpfolder" > /dev/null
cd "$tmpfolder" > /dev/null

# let's go to business
errors=0
for testin in "$test_folder"/testfile*.txt;
do
    if [ "$errors" -ne "0" ];
    then
        break
    fi
    testioin=$(basename -- "$testin")
    filenumber=${testioin##testfile}
    testnumber=${filenumber%.*}
    testioout="expected$filenumber"
    filesinprefix=filein$testnumber"_"
    filesoutprefix=fileout$testnumber"_"

    # remove preexisting output files
    rm_fileout "$test_folder/$filesoutprefix"
    # copy input test files
    cp_filein "$test_folder/$filesinprefix" "$tmpfolder"

    # do the testing stuff
    java $INTROPRG_JAVAPOLICYFILE "$program" < "$testin" &> "$tmpfile"
    errors=$?
    if [[ "$errors" == "0" ]];
    then
        diff $diffoptions "$test_folder/$testioout" "$tmpfile" &> "$tmpdiff"
        errors=$?
        # Display the difference
        if [[ "$errors" != "0" ]];
        then
            display_stdout_difference "$testnumber" "$testin" "$test_folder/$testioout" "$tmpfile" "$tmpdiff"
        else
            if compgen -G "$test_folder/$filesoutprefix*" > /dev/null;
            then
                for fileout in "$test_folder/$filesoutprefix"*;
                do
                    fileoutname=$(basename -- "$fileout")
                    fileoutdest=${fileoutname#*_}
                    diff $diffoptions $fileout $fileoutdest &> $tmpdiff
                    errors=$?
                    if [[ "$errors" != "0" ]];
                    then
                        display_output_difference "$testnumber" "$fileoutdest" "$fileout" "$tmpdiff"
                        break;
                    fi
                done
            fi
        fi
    else
        echo "Error: Problemes executant el programa"
        cat "$tmpfile"
    fi
    # remove input test files
    rm_filein "$test_folder/$filesinprefix"
done


# get rid of temporary folder
rm -rf "$tmpfolder"
cd - > /dev/null
exit $errors
