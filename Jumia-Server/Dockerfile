FROM openjdk:8
ADD ./target/JumiaServiceExercise-0.0.1-SNAPSHOT.jar JumiaServiceExercise-0.0.1.jar
ADD sample.db sample.db
ENTRYPOINT ["java","-jar","JumiaServiceExercise-0.0.1.jar"]
EXPOSE 8080