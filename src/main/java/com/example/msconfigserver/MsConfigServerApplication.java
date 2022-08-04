package com.example.msconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * ConfigServer application.
 *
 * @author Alisson Arteaga / Christian Dionisio
 * @version 1.0
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class MsConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(MsConfigServerApplication.class, args);
  }

}
