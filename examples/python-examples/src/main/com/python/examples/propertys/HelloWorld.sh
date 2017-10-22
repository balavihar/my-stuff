#!/usr/bin/env bash
echo "Hello ${1}"
echo "Hello $1"
echo $#
if [ ! -r ${1} ]
then
        echo "Can't read properties file ${1}"
        exit 2
fi

exit 0