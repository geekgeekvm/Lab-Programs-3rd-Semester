for (( i=10; i<999; i++))
do
	if [ $i -lt 100 ]
	then
	a=`expr $i % 10`
	b=`expr $i / 10`
	b=`expr $b % 10`
	res=`expr $a \* $a \* $a + $b \* $b \* $b`
	else
	a=`expr $i % 10`
	b=`expr $i / 10`
	b=`expr $b % 10`
	c=`expr $i / 100`
	c=`expr $c % 10`
	res=`expr $a \* $a \* $a + $b \* $b \* $b + $c \* $c \* $c`
	fi
	if [ $i -eq $res ]
	then
	echo $i
	fi
done