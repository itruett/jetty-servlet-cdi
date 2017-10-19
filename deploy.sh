#!/bin/bash
mvn clean package
cp target/jetty-servlet-cdi-0.0.1-SNAPSHOT.war ../../appservers/jetty-distribution-9.4.7.v20170914/webapps/

