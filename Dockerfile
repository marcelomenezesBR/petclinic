FROM openjdk:17
COPY ./target/webstart-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","webstart-0.0.1-SNAPSHOT.jar"]
