FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /Online-Food-Ordering

COPY pom.xml .
RUN mvn dependency:go-offline


COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /Online-Food-Ordering

COPY --from=build /Online-Food-Ordering/target/Online-Food-Ordering-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar","/Online-Food-Ordering/Online-Food-Ordering-0.0.1-SNAPSHOT.jar"]





