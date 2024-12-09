FROM openjdk:17-jdk

WORKDIR /app/zip-go
COPY build/libs/house-0.0.1-SNAPSHOT.jar house.jar

ENTRYPOINT ["java", "-jar", "/app/zip-go/house.jar"]