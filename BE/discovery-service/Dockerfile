FROM maven:3.8-amazoncorretto-21 AS builder
COPY . ./app
WORKDIR /app
RUN mvn clean package

FROM amazoncorretto:21
COPY --from=builder /app/target/discovery-service-1.0.0.jar /discovery-service.jar
ENV SPRING_PROFILES_ACTIVE dev
EXPOSE 8080
ENTRYPOINT ["java","-jar","discovery-service.jar"]