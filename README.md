#Spring Boot Camel Sample Application

This a sample Spring Boot application that includes an Apache Camel (http://camel.apache.org/) route and Hawtio (http://hawt.io/).

##Basic How-to
Requires Java 8.

###Maven
1. Make sure you have Maven installed
2. In your console, under the project directory, run: mvn clean package
3. Then run: java -jar target/spring-boot-camel-sample-{version}.jar

###Using Eclipse:
1. Right click edu.bowdoin.spring.boot.sample.SampleApplication.java
2. Select Run as -> Java application

###Hawtio
1. Once the application has started up successfully, in any web browser, go to localhost:8080/hawtio/index.html and select the Camel tab. You should see your Camel Route running.
