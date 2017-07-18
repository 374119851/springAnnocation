package com.spring.demo.bean;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/7/18.
 */

public class UserTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSave() throws Exception {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META_INF/applicationContext.xml");
        User user= (User) ctx.getBean("uId");
        System.out.println(user.toString());

    }



}
