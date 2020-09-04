package com.zhh.test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandler {

    @RequestMapping("/hello")
    public String getMessage() {
        return "Hello!";
    }
}
