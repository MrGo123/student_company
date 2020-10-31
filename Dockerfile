FROM java:8
VOLUME /tmp
ADD target/student_company-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]