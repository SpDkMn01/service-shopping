FROM openjdk:11
VOLUME /tmp
EXPOSE 8000
ADD ./target/Shopping-0.0.1-SNAPSHOT.jar Shopping.jar
ENTRYPOINT ["java","-jar","/Shopping.jar"]