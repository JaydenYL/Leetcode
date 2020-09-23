#!/bin/bash

#rm `find ./ -name "*.class"`
strr="`find ./ -name "*.class"` "" `find ./ -name "a.out"`"
rm $strr
#echo $strr