# FROM maven:3.8.2-jdk-21 # for Java 21
FROM maven:3.8.5-openjdk-21

WORKDIR /productservice-app
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run