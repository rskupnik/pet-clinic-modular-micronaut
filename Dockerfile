FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/pet-clinic-modular-micronaut*.jar pet-clinic-modular-micronaut.jar
CMD java ${JAVA_OPTS} -jar pet-clinic-modular-micronaut.jar