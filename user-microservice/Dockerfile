# Build
FROM maven:3.8-amazoncorretto-21 AS builder
COPY pom.xml /app/
WORKDIR /app
RUN mvn dependency:go-offline
COPY src /app/src
RUN mvn clean package

# Create a runtime image
FROM amazoncorretto:21
COPY --from=builder /app/target/user-microservice-1.0.0.jar /user-microservice.jar
ENV SPRING_PROFILES_ACTIVE dev
EXPOSE 8081
ENTRYPOINT ["java","-jar","user-microservice.jar"]