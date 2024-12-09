FROM openjdk:17-jdk

WORKDIR /zip-go
COPY /build/libs/house-0.0.1-SNAPSHOT.jar house.jar

ENTRYPOINT ["java", "-jar", "zip-go/house.jar"]