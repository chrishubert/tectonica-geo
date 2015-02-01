#!/bin/sh
cd ~/tectonica-geo/tectonica-geo-server
nohup mvn clean package -Djetty.port=80 -Djava.util.logging.config.file=etc/logging.properties jetty:run &> /var/log/geo.log &
tail -f /var/log/geo.log
