package com.wenhao.cloudstudy.eurekaserverha2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHa1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHa1Application.class, args);
    }

}

