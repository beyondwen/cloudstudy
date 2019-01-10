package com.wenhao.cloudstudy.eurekaclientmember2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientMember2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientMember2Application.class, args);
    }

}

