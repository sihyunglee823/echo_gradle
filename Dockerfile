FROM openjdk:8-jdk
ADD ./demo_gradle-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "demo_gradle-0.0.1-SNAPSHOT.jar"]
