FROM openjdk:8
ENV SPRING_PROFILES_ACTIVE prod
VOLUME /tmp
EXPOSE 8081
ADD ./target/ms_config_server-0.0.1-SNAPSHOT.jar ms-config-server.jar
ENTRYPOINT ["java","-jar","/ms-config-server.jar"]