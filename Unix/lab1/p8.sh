#!/bin/sh
if [ $# -eq 0 ]
then
echo "Error-no input given."
echo "Syntax: $0 number"

else
echo "Use to print multiplication table for a nukmber."
n=$1
for ((i=1;i<=10;i++))
do
echo "$i * $n =`expr $i \* $n`"
done
fi
