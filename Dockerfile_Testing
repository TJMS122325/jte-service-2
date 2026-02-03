FROM openjdk:17-slim AS runtime
WORKDIR /app
COPY target/demo-service-2.jar /app/demo-service-2.jar
ENTRYPOINT ["java","-jar","demo-service-2.jar"]
