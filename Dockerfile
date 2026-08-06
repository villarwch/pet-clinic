FROM eclipse-temurin:11-jre

EXPOSE 8085

COPY target/spring-petclinic-2.6.0-SNAPSHOT.jar /app/app.jar

WORKDIR /app

CMD ["java", "-jar", "app.jar"]