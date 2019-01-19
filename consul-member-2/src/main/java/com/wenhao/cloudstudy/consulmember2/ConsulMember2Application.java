package com.wenhao.cloudstudy.consulmember2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMember2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulMember2Application.class, args);
    }

}

