FROM java:8-jdk-alpine
COPY target/scientific_calculator-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-cp","scientific_calculator-1.0-SNAPSHOT.jar","calculator"]

