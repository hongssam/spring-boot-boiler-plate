FROM openjdk:21-jdk
COPY build/libs/boot.jar boot.jar
ENTRYPOINT ["java","-jar","boot.jar"]
