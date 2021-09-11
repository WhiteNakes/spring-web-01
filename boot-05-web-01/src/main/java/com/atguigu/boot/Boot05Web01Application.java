package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author shkstart
 * @create 2021-09-06 22:52
 */

@SpringBootApplication
public class Boot05Web01Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot05Web01Application.class);

    }
}
