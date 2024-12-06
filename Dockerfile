FROM openjdk:17-jdk

WORKDIR /app
COPY build/libs/*SNAPSHOT.jar house.jar

ENTRYPOINT ["java", "-jar", "/app/house.jar"]
