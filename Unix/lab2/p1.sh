select k in month year quit
do
case $k in
month) cal;;
year) yr=`date +%m`
cal $yr;;
quit) echo bye bye
exit;;
*) echo try again;;
esac
done

