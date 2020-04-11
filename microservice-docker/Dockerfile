FROM jdk-8u231:v1
MAINTAINER ahuang

#创建项目目录
ADD  target/microservice-docker-1.0-SNAPSHOT.jar /usr/local/webdeploy

#运行docker时运行
CMD ["nohup","java","-jar","/usr/local/webdeploy/microservice-docker-1.0-SNAPSHOT.jar","&"]
