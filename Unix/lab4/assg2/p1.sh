if [ $2 -gt 0 ]
	then
	if [ $1 -le 0 ]
		then
		echo "Negative number and zero not allowed. "
		exit
	fi
fi
if [ $1 -gt 0 ]
	then
	if [ $2 -le 0 ]
		then
		echo "Negative number and zero not allowed. "
		exit
	fi
fi
if [ $1 -lt 0 ]
	then
	if [ $2 -lt 0 ]
		then
		echo "Negative numbers not allowed."
		exit
	fi
fi
if [ $1 -gt $2 ]
	then
	echo "scale=2; $2 / $1 " | bc
else
	echo "scale=2; $1 / $2 " | bc
fi



