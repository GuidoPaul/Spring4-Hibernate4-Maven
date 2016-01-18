# Spring4-Hibernate4-Maven

NOTES:

  * This project is built using release Java 8, Spring 4.0.1 and Hibernate 4.3.1 - see pom.xml.

  /* * The POM builds a JAR file, not a WAR, so you must run it as a Web application.  Use `mvn exec:java` or `mvc spring-boot:run` to run it, then goto ```http://localhost:8080```. */


#### Release History
  * February 2015: V1
  * January  2016: V2

## Application Overview
  * alibaba druid
  * ehcache
  * slf4j + log4j not commons-logging

## Application Run

Step 1. Import ```usersdb.sql``` database in mysql

Step 2. Run Project
  * Press ```Run Project``` or Press ```F6``` then project will be automatically opened on Firefox
  * Deploy the project (take the Spring4-Hibernate4-Maven-1.0-SNAPSHOT.war in the Tomcat webapps folder) and turn on the ```Tomcat``` server then goto ```http://localhost:8080/Spring4-Hibernate4-Maven```
