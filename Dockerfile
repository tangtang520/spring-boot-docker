FROM java:8
VOLUME /tmp
COPY target/docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]  