FROM adoptopenjdk/openjdk11
#FROM openjdk:jdk-alpine

RUN mkdir /app
WORKDIR /app

ENTRYPOINT ["sh", "/app/gradlew", "bootRun"]
