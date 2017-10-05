#!/bin/sh
os=0;
echo "1.Unix   \n\n2.Linux"

echo "Enter your OS choice {1 or 2}"
read os
if [ $os -eq 1 ];then
echo "You pick unix"
else
if [ $os -eq 2 ];then
echo "You pick linux"
else
echo "You don't pick either"
fi
fi
