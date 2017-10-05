#!/bin/sh
#finding average

echo "Enter number of integers to find average of."
read n

summ=0

for (( i=1; i<=n; i++ ))
do
	echo "Enter $i th number : "
	read x
	summ=$(echo "scale=2; $summ + $x" | bc)
	echo $summ
done

summ=$(echo "scale=2; $summ / $n" | bc)

echo "Average is $summ"
