# Demo Project

A toy project.

# Prerequisites

Java 21

If you have sdkman, run `sdk env`

## Running the container

`docker image build -t demo-image .`

## Running without the container

### Compile the application

`mvn clean package`

### Run the Jar file

`java -jar target/demo-0.0.1-SNAPSHOT.jar`

