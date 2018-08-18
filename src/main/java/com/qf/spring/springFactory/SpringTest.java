package com.qf.spring.springFactory;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by it_mck 2018/8/9 20:05
 *
 * @Description:静态工厂
 * @Version: 1.0
 */
public class SpringTest {


    @Test
    public void run() {

        //加载xml配置文件
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User user = ctx.getBean("user",User.class);
        user.setName("小明");
        user.setPwd("123");
        System.out.println(user);
        ctx.close();


    }


}
