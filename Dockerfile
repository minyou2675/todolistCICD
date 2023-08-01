FROM java
CMD ./gradlew clean build
COPY build/libs/*.jar ./
ENTRYPOINT ["java","-jar","app.jar"]
