FROM openjdk:21-jdk-slim

RUN apt-get update && apt-get install -y git

WORKDIR /app

RUN git clone https://github.com/isicju/quick_pipeline.git .

RUN chmod +x ./gradlew

RUN ./gradlew build test --tests com.example.demo.EmptyUnit

