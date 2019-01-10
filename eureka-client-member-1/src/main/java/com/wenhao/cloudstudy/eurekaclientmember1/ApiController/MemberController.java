package com.wenhao.cloudstudy.eurekaclientmember1.ApiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMemberInfo")
    public String getMemberInfo() {
        return "memberinfo api springcloud2.0 学习"+serverPort;
    }
}
