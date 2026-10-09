FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY domain/pom.xml domain/
COPY application/pom.xml application/
COPY infrastructure/pom.xml infrastructure/
# Resolve dependencies
RUN mvn dependency:go-offline -B

COPY domain/src domain/src
COPY application/src application/src
COPY infrastructure/src infrastructure/src
RUN mvn clean package -DskipTests

FROM tomcat:10.1-jdk21
COPY --from=build /app/infrastructure/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
