FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/calculadora-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-cp", "/app/app.jar", "com.zubiri.Calculadora"]