#basic calculator
#!/bin/sh

echo "Enter 2 numbers."
read a; read b
echo -e "Enter operation: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus "
read op
if [ $op == 1 ]
then
echo "scale=2; $a + $b" | bc
elif [ $op == 2 ]
then
echo "scale=2; $a - $b" | bc
elif [ $op == 3 ]
then
echo "scale=2; $a * $b" | bc
elif [ $op == 4 -a $b == 0 ]
then
echo "Division with zero as denominator not allowed!!!!"
elif [ $op == 4 -a $b != 0 ]
then
echo "scale=2; $a / $b" | bc
elif [ $op == 5 ]
then
echo `expr $a % $b`
else
echo "Invalid entry."
fi


