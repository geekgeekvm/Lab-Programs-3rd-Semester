#!/bin/sh
echo "enter n"
read n
sum=$(echo "scale=2; $n * ( $n + 1 ) / 2" | bc)
echo $sum
