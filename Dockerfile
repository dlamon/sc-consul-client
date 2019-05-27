FROM openjdk:8-jdk-alpine
MAINTAINER liaowei
VOLUME /tmp
ARG JAR_FILE
ARG PROFILE_ACTIVE
COPY ${JAR_FILE} app.jar
EXPOSE 8500
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=${PROFILE_ACTIVE}","-jar","/app.jar"]
