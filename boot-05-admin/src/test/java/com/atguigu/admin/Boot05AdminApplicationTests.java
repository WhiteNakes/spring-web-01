package com.atguigu.admin;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.mapper.UserMapper;
import com.atguigu.admin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class Boot05AdminApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {

        Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM tbl_dept", Long.class);
        System.out.println(aLong);
        System.out.println(dataSource.getClass());
    }


    @Test
    void testUserMapper(){
        List<User> list = userService.list();
        System.out.println(userService);
    }

}
