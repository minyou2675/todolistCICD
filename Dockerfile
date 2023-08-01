FROM openjdk:17-jre
COPY build/libs/*.jar
ENTRYPOINT ["java","-jar","app.jar"]
