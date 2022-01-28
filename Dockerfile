
FROM java:8-jdk-alpine

COPY ./dist/Quadratic.jar /usr/app/quadratic.jar

WORKDIR /usr/app/

EXPOSE 8080

CMD ["java", "-jar", "quadratic.jar", "1", "-1", "-6"]
#CMD ["java", "-jar", "quadratic.jar"]


