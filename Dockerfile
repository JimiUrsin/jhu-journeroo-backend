FROM amazoncorretto:17
EXPOSE 8080
ADD ./build/libs/journeroo-0.0.1-SNAPSHOT.jar journeroo.jar
ENTRYPOINT ["java", "-jar", "journeroo.jar", "-DPOSTGRES_PASSWORD=${POSTGRES_PASSWORD}"]
