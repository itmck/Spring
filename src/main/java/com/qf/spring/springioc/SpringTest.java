package com.qf.spring.springioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by it_mck 2018/8/9 20:05
 *
 * @Description:
 * @Version: 1.0
 */
public class SpringTest {


    @Test
    public void run() {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ctx.getBean("user",User.class);
        user.setName("小明");
        user.setPwd("123");
        System.out.println(user);
        System.out.println("--------------------");
        User user1 = (User) ctx.getBean("user");
        user1.setName("小红");
        user1.setPwd("456");

        System.out.println(user1);

        ctx.close();


    }


}
