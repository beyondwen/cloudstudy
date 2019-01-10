package com.wenhao.cloudstudy.eurekaserverha3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHa3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHa3Application.class, args);
    }

}

