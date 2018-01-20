package com.bennzhang.springcloud.config.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {
    @Value("${example.message}")
    private String msg;

    @RequestMapping("/message")
    String getMsg() {
        return this.msg;
    }
}
