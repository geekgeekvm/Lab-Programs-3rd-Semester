#!/bin/sh
if cat $1
then
echo -n "\n\nFile $1 found"
fi
