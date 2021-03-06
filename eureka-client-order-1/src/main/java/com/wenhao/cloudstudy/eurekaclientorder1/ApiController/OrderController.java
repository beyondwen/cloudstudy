package com.wenhao.cloudstudy.eurekaclientorder1.ApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo() {
        String uri = "http://member/getMemberInfo";
        return restTemplate.getForObject(uri, String.class);
    }
}
