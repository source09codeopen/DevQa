# Use Java 11
FROM openjdk:11-jdk

#COPY JAR FILE
COPY target/aws-springboot-dp-1.0.0.jar yadacode-aws-springboot-dp-1.0.0.jar

ENTRYPOINT ["java","-jar","/yadacode-aws-springboot-dp-1.0.0.jar"]