#!/bin/sh
select k in date cal who whoami tty
do
case $k in 
date) date;;
cal) cal;;
who) who;;
whoami) who i am;;
tty) tty;;
*) echo "try again";;
esac
done

