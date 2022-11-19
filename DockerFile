FROM openjdk:8
EXPOSE 8080
Add target/create-docker12.jar create-docker12.jar
ENTRYPOINT ["java", "-jar", "/create-docker12.jar"]