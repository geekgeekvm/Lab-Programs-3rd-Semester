echo "Enter the 5 elements:"
for((i=0;i<5;i++))
do
echo "Enter $((i+1)) number"
read nos[$i]
done

small=${nos[0]}
greatest=${nos[0]}
for((i=0;i<5;i++))
do
if [ ${nos[$i]} -lt $small ]; then
small=${nos[$i]}

elif [ ${nos[$i]} -gt $greatest ]; then
greatest=${nos[$i]}
fi
done

echo "smallest number in an array is $small"
echo "greatest number in an array is $greatest"