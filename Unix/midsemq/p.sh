echo "Enter name"
read name
count=0
f=`ls -l $name`
for i in f
do
if test $count==0
then
if test $i==d
then
echo "directory"
elif test $i==b
then
echo "Block file"
elif test $i==c
then
echo "terminal file"
else
echo "file"
fi
fi
if test $count==1
then
if test $i==r
then
echo "readable"
else
echo "not readable"
fi
fi
if test $count==3
then
if test $i==x
then
echo "executable"
else
echo "not executable"
fi
fi
done
