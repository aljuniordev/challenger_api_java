## BUILD EXECUTABLE stage 1 ##
FROM openjdk:17-jdk AS builder
WORKDIR /usr/build
COPY src src
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw package -DskipTests

## EXECUTE APPLICATION stage 2 ##
FROM openjdk:17-jre
WORKDIR /usr/app
COPY --from=builder /usr/build/target/challenge_api_java.jar challenge_api_java.jar
EXPOSE 3000
ENTRYPOINT ["java","-jar","challenge_api_java.jar"]