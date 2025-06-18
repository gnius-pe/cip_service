FROM maven:3.9.9-eclipse-temurin-17 AS builder
LABEL authors="Ramos Cruzado Igor Founder Gnius code"
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
COPY .env .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
RUN apt-get update && apt-get install -y ca-certificates && rm -rf /var/lib/apt/lists/*
COPY .env .
WORKDIR /app
ARG JAR_FILE=target/padron-service-0.0.1-SNAPSHOT.jar
COPY --from=builder /app/${JAR_FILE} padron-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "padron-service.jar"]