#!/usr/bin/env bash

cd /home/ubuntu/server
sudo /usr/bin/java -cp "website-1.0-SNAPSHOT.jar;lib/*.jar" -jar website-1.0-SNAPSHOT.jar \
 > /dev/null 2> /dev/null < /dev/null &