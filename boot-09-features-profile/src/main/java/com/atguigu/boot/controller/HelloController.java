package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2021-09-11 19:26
 */

@RestController
public class HelloController {

    @Resource
    private Person person;


    @Value("${person.name:李四}")
    @GetMapping("/")
    public Person hello(){
        System.out.println(person);
        return person;
    }
}
