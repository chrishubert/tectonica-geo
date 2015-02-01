# Dockerfile for AeroGear with Bringoz setup
#
# build: sudo docker build -t tectonica/geo docker
# run:   sudo docker run -it -p 80:80 tectonica/geo

FROM centos:latest

MAINTAINER Zach Melamed <zach@tectonica.co.il>

# Install utilities and setup environment
RUN yum install -y tar nano net-tools

# Install Java 7
RUN yum -y install java-1.7.0-openjdk-devel && yum -q clean all
ENV JAVA_HOME /usr/lib/jvm/java-1.7.0-openjdk

# Install and upgrade Maven
RUN yum install -y maven
RUN cd /usr/share && \
	mv maven maven-old && \
	mkdir maven && \
	cd maven && \
	curl http://apache.mivzakim.net/maven/maven-3/3.2.5/binaries/apache-maven-3.2.5-bin.tar.gz | tar zx --strip 1

# Install Git and clone repository
RUN yum install -y git
RUN cd && git clone https://github.com/zach-m/tectonica-geo.git
RUN cd ~/tectonica-geo && \
	git config user.email "zach@tectonica.co.il" && \
	git config user.name "zach-m" && \
	git config push.default simple

# Perform first global build (also retrieves most of the dependencies)
RUN cd ~/tectonica-geo && mvn install

# Download a map
RUN mkdir -p /var/tectonica/geo && \
	curl -o /var/tectonica/geo/map.osm.pbf http://download.geofabrik.de/asia/israel-and-palestine-latest.osm.pbf

# Configure PATH	
RUN echo 'PATH=$PATH:/root/tectonica-geo/scripts' >> ~/.bashrc

CMD ["bash"]
