#/bin/bash

AIRFLOW_HOME=$1
ZIP_FILE=$2

JOB_FOLDER=$AIRFLOW_HOME/jobs

FILE=$JOB_FOLDER/$ZIP_FILE
FILE_DIRECTORY=$JOB_FOLDER/$ZIP_FILE

unzip $FILE -d $FILE_DIRECTORY
rm -f $FILE
chmod -R 777 $FILE_DIRECTORY