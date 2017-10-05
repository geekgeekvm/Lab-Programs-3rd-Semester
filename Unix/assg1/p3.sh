#!/bin/sh

echo "enter basic"
read basic
dp=$(echo "scale=2; 0.5 * $basic" | bc)
plus=$(echo "scale=2; $basic + $dp" | bc)
da=$(echo "scale=2; 0.35 * $plus" | bc)
hra=$(echo "scale=2; 0.08 * $plus" | bc)
ma=$(echo "scale=2; 0.03 * $plus" | bc)
pf=$(echo "scale=2; 0.1 * $plus" | bc)
salary=$(echo "scale=2; $basic + $dp + $da + $hra + $ma - $pf" | bc)
echo "Salary is $salary"
