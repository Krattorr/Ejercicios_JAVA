#!/bin/bash
# Aquest programa realitza els tests d'un exercici programat en Java

script_base=$(dirname "$0")

# Check pwd is in a exercise folder
exercise_base=$PWD
test_folder="$exercise_base/test"
if [ ! -d "$test_folder" ];
then
    echo
    echo "Error"
    echo "====="
    echo "El directori actual no correspon al d'un exercici amnb test"
    exit
fi

# Check test configuration
if [ ! -f "$test_folder/programname" ];
then
    echo
    echo "Error"
    echo "====="
    echo "Problemes amb la teva còpia del test. Considera recuperar l'original"
    exit
fi

programname=$(cat $test_folder/programname)
if [ ! -f $programname ];
then
    echo
    echo "Error"
    echo "====="
    echo "No es troba el programa $programname"
    echo "Assegura't que has posat el nom correcte al teu programa"
    echo
    exit
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

if [ -f "$1" ];
then 
    javaoptions="-Djava.security.manager -Djava.security.policy=$1"
else
    javaoptions=""
fi

error=0
for test in $test_folder/test_*;
do
    test_mark=$(basename $test)
    test_script="$script_base/${test_mark%%.*}.sh"
    bash $test_script $exercise_base/$programa $javaoptions
    if [ $? -ne 0 ];
    then
        error=1
        break
    fi
done

if [ $error -eq 0 ];
then
    echo "El programa $programname ha passat totes les proves"
else
    exit 1
fi
