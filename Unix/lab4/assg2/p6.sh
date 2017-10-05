count=0
for i in `ls`
do
((count++))
done
echo "Number of files and directories is $count"
echo "Directories:"
ls -d
echo "Files only:"
ls -p | grep -v /