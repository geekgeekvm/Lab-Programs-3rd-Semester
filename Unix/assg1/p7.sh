#!/bin/sh
echo "enter a and b"
read a; read b
echo -n "Area is "
echo "scale=2; $a * $b" | bc

