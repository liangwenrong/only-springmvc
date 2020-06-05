package com.exemple.cnntroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/a")
    public String  testA(){
        return "你好a";
    }



}
