FROM ubuntu:24.04
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/java.jar
EXPOSE 8080
RUN apt-get update && apt-get install -y openjdk-21-jre
CMD ["java", "-jar", "java.jar"]