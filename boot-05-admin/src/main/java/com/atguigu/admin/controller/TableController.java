package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-09-08 12:24
 */

@Controller

public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String baic_table() {

        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@RequestParam("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1") Integer pn,
    RedirectAttributes ra){

        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:dynamic_table";

    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn,
                                            Model model) {

//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi", "123444"),
//                new User("haha", "aaaaa"),
//                new User("hehe ", "aaddd"));
//        model.addAttribute("users", users);

        List<User> list = userService.list();
        model.addAttribute("users",list);
        Page<User> userPage = new Page<>(pn, 2);

        Page page = userService.page(userPage, null);

        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List records = page.getRecords();

        model.addAttribute("page",page);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {

        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }

}

