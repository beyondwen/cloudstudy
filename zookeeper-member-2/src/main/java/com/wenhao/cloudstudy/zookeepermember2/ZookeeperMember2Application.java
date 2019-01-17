package com.wenhao.cloudstudy.zookeepermember2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperMember2Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMember2Application.class, args);
    }

}

