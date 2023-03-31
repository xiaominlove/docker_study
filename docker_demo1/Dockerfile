FROM openjdk:8-jdk-slim
LABEL maintainer=xiaomin

COPY target/*.jar   /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]