#!/bin/sh
if [ -z $1 ]
then rental="unknown"
elif [ -n $1 ]
then rental=$1 
fi
case $rental in 
"car") 
echo "Rs.20 per km for $rental";;
"van") echo "Rs.30 per km for $rental";;
"bicycle") echo "20 paisa per km for $rental";;
*) echo "Sorry i cant get a rental for you";;
esac

