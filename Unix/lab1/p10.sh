#!/bin/sh
if [ $# -eq 0 ]
then
echo "Error: No input "
echo "Syntax: $0 number "
else
echo "Printing multiplication table for $1 "
n=$1
i=1
while [ $i -le 10 ]
do
echo "$n * $i =`expr $n \* $i `"
i=`expr $i + 1`
done
fi
