FROM openjdk:17-jdk-alpine

COPY target/*.jar /api.jar
ENTRYPOINT ["java","-jar","/api.jar"]
