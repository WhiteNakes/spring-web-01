package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

/**
 * @author shkstart
 * @create 2021-09-07 21:28
 */

@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM tbl_dept", Long.class);
        return aLong.toString();
    }

    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","账号密码错误，被拦截器截胡");
            return "login";
        }

    }

    @GetMapping("main.html")
    public String mainPage(HttpSession session,Model model){

//        Object loginUser = session.getAttribute("loginUser");
//        System.out.println(loginUser);
//        if(loginUser != null){
            return "main";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }


    }


}
