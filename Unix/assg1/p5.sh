#!/bin/sh
#finding average

echo "Enter number of integers to find sum upto."
read n

summ=0

for (( i=1; i<=n; i++ ))
do
	
	summ=$(echo "scale=2; $summ + $i" | bc)
	echo $summ
done



echo "Sum is $summ"
