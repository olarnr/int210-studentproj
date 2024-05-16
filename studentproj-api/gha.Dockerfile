FROM openjdk:17-jdk-alpine AS build
WORKDIR /code
COPY . .
RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-alpine AS run
COPY --from=build /code/target/*.jar /api.jar
ENTRYPOINT ["java","-jar","/api.jar"]

LABEL org.opencontainers.image.source = "https://github.com/olarnr/int210-studentproj"