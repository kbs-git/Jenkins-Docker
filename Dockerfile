FROM openjdk:17
EXPOSE 8080
ADD target/selenium-test.jar selenium-test.jar
ENTRYPOINT ["java","-jar","/selenium-test.jar"]