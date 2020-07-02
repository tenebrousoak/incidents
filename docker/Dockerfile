FROM openjdk:8-alpine

VOLUME /usr/app
WORKDIR /usr/app

COPY ./target/incidents-1.0-SNAPSHOT.jar /usr/app

EXPOSE 4567

CMD java -jar incidents-1.0-SNAPSHOT.jar