package com.atguigu.admin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-09-11 16:37
 */


@DisplayName("Junit5功能测试类")
public class Junit5Test {

    @DisplayName("测试DisplayName")
    @Test
    void testDisplayName(){
        System.out.println(1);

    }

    @RepeatedTest(5)
    @Test
    void test3(){
        System.out.println(5);
    }


}
