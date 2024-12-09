FROM openjdk:17-jdk

WORKDIR /back-to-back
COPY build/libs/house-0.0.1-SNAPSHOT.jar /back-to-back/house.jar

ENTRYPOINT ["java", "-jar", "/back-to-back/house.jar"]