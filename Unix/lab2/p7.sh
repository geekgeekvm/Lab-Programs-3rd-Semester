#stty
#!/bin/sh
stty
#changing eof setting 
stty eof \^c
#restoring eof settings
stty sane

#hiding password
pass=hello
echo "Enter your password"
stty -echo
read pswrd
if [ $pswrd == $pass ]
then
echo "Permission granted."
else
echo "Permisiion denied."
fi

stty echo

