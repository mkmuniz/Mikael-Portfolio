FROM maven:3.8.4-openjdk-11-slim as build

WORKDIR /app
COPY ./pom.xml .
RUN mvn dependency:go-offline

COPY ./src ./src
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ENV PORT=8080
EXPOSE ${PORT}

CMD ["java", "-jar", "-Dserver.port=${PORT}", "app.jar"] 