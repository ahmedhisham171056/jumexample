FROM openjdk:8
ADD ./target/JumiaServiceExercise-0.0.1-SNAPSHOT.war JumiaServiceExercise-0.0.1.war
ADD sample.db sample.db
ENTRYPOINT ["java","-jar","JumiaServiceExercise-0.0.1.war"]
EXPOSE 8080