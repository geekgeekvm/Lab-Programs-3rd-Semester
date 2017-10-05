echo -e "Choose: \n1.Current home \n2.Current username \n3.Current date \n4.Current number of users \n5.Current terminal"
read n
case $n in
	1) echo $HOME;;
	2) whoami;;
	3) echo -n "Today is "
	   date +%D;;
	4) echo "No of users logged in "
	   who --count;;
	5) tty;;
	*) echo "Invalid option"
	   exit;;
esac
