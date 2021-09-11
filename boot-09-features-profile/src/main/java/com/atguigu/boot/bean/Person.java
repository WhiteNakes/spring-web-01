package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-09-11 19:54
 */

@Configuration("person")
@Component
@Data
public class Person {

    private String name;
    private Integer age;

}
