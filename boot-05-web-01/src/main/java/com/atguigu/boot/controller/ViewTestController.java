package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shkstart
 * @create 2021-09-07 20:52
 */

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model){

        model.addAttribute("msg","您好 atguigu");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
