FROM openjdk:8 
ADD target/docker-spring-boot-ejemplo.jar docker-spring-boot-ejemplo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar", "docker-spring-boot-ejemplo.jar"]