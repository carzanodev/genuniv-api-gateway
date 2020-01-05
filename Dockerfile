FROM openjdk:11-slim
ADD target/genuniv-api-gateway.jar genuniv-api-gateway.jar
EXPOSE 18000
ENTRYPOINT ["java", "-jar", "genuniv-api-gateway.jar"]