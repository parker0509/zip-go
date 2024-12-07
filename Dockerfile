FROM openjdk:17-jdk

WORKDIR /zip-go
COPY build/libs/*SNAPSHOT.jar house.jar

ENTRYPOINT ["java", "-jar", "/zip-go/house.jar"]
