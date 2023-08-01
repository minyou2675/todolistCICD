FROM openjdk:17-jre
CMD ./gradlew clean build
COPY build/libs/*.jar
ENTRYPOINT ["java","-jar","app.jar"]
