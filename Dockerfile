FROM openjdk:8

EXPOSE 8088

ADD target/sai.jar sai.jar

ENTRYPOINT ["java","-jar","sai.jar"]