package com.wenhao.cloudstudy.consulmember1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMember1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulMember1Application.class, args);
    }

}

