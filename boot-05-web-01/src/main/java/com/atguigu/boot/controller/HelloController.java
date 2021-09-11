package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2021-09-06 22:57
 */
@RestController
public class HelloController {

    @RequestMapping("/1.jpg")
    public String hello(){
        return "aaa";
    }

}
