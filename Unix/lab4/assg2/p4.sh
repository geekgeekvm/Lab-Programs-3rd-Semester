pc=0
nc=0
zc=0
echo "Enter 10 numbs"
for (( i=0; i<10; i++))
do
read no[$i]
if [ ${no[$i]} -gt 0 ]
	then 
	((pc++))
elif [ ${no[$i]} -lt 0 ]
	then
	((nc++))
else
	((zc++))
fi
done

for (( i=0; i<10; i++ ))
do
for (( j=$i; j<10; j++ ))
do
if [ ${no[$i]} -gt ${no[$j]}  ]
    then
        t=${no[$i]}
        no[$i]=${no[$j]}
        no[$j]=$t
fi
done
done

echo "Numbers in ascending order are :"
for ((i=0; i<10; i++))
do
echo ${no[$i]}
done

echo "Number of positive, negative and zero are $pc $nc $zc "


