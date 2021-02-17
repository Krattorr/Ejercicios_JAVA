#!/bin/bash
# Aquest guió realitza els tests d'un exercici programat en Java

# El programa està preparat per executar les proves a la subcarpeta test/

# La subcarpeta test/ correspon a tests definits pel docent i no haurien
# de ser modificats pels estudiants doncs poden ser reescrits en qualsevol
# moment

# Es recomana molt no modificar aquest programa doncs pot ser sobreescrit
# en qualsevol moment pel docent. Si et cal cap canvi, consulta-ho abans.

script_base=$(dirname "$0")

# Check pwd is in a exercise folder
exercise_base=$PWD

if [ -z "$INTROPRG_JAVAPOLICYFILE" ];
then
    test_folders="test mytests"
else
    test_folders="test"
fi

has_test=0
test_subfolder=test

test_folder="$exercise_base/$test_subfolder"
if [ ! -d "$test_folder" ];
then
    echo
    echo "Error"
    echo "====="
    echo
    echo "La carpeta actual no sembla correspondre a un exercici amb correcció automàtica"
    exit 1
fi
has_test=1

# Check whether cwd is an actual exercise folder
if [ ! -d  test ];
then
    echo
    echo "Error"
    echo "====="
    echo
    echo "La carpeta actual no sembla correspondre a un exercici de introprg amb suport de prova automàtica."
    exit 1
fi


# Check test configuration
if [ ! -f "$test_folder/programname" ];
then
    echo
    echo "Error"
    echo "====="
    echo
    echo "Problemes amb el test $test_folder. Si l'has modificat, considera recuperar l'original"
    exit 1
fi

programname=$(cat "$test_folder"/programname)
if [ ! -f "$programname" ];
then
    echo
    echo "Error"
    echo "====="
    echo
    echo "No es troba el programa $programname"
    echo "Assegura't que has posat el nom correcte al teu programa"
    echo
    exit 1
fi

programa=${programname%%.*}
if [ ! -f "$programa.class" ];
then
    echo "Comprova si has compilat $programa.java"
    exit 1
fi

if [ "$programa.java" -nt "$programa.class" ];
then
    echo "Comprova si has recompilat $programa.java després de modificar-lo"
    exit 1
fi

if ! ls $test_folder/test_* &> /dev/null;
then
    echo
    echo "Error"
    echo "====="
    echo
    echo "Aquesta carpeta no sembla contenir tests"
    exit 1
fi

error=0
for test in $test_folder/test_*;
do
    test_mark=$(basename "$test")
    test_script="$script_base/${test_mark%%.*}.sh"
    title="Testing ${test_mark#*_}"
    echo
    echo $title
    echo $title | tr [:print:] '='
    echo
    bash "$test_script" "$exercise_base/$programa" "$test_folder"
    if [ $? -ne 0 ];
    then
        error=1
        break
    else
        echo "Fet"
    fi
done

if [ $error -eq 0 ];
then
    echo
    echo "El programa $programname ha passat totes les proves"
else
    exit 1
fi
