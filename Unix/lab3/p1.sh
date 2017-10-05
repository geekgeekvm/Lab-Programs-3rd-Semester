#palindrome

#!/bin/sh
echo "Enter string"
read str
len='echo $str | wc -c'
echo $len
len=`expr $len - 1`
echo $len
i=1
j=`expr $len / 2`
while [ $i -le $j ]
do
str1='echo $str | cut -c $i'
str2='echo $str | cut -c $len'
if [ $str1 -eq $str2 ]
then
echo "not a Palindrome"
exit
fi
i=`expr $i + 1`
len=`expr $len - 1`
done
echo "palindrome"

