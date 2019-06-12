FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY target/zctest-demo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
