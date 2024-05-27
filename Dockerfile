FROM openjdk:17-alpine

COPY ./target/*.jar  target.jar
EXPOSE 8080

CMD [ "java","-jar","target.jar" ] 