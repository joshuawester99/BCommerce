# Stage 1: Base image with Java 11
FROM openjdk:11-slim

LABEL maintainer="Joshua Wester <jkwester99@gmail.com>"

# Argument for the JAR file (matches Maven build)
ARG JAR_FILE=target/*.jar

# Copy the JAR into the image
COPY ${JAR_FILE} app.jar

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","/app.jar"]
