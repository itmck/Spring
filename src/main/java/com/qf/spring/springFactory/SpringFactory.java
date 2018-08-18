package com.qf.spring.springFactory;

/**
 * Create by it_mck 2018/8/9 20:35
 *
 * @Description:
 * @Version: 1.0
 */
public class SpringFactory {

    /**
     *
     *	静态方法
     */
    public static User getUser(){
        System.out.println("------静态工厂创建User------");
        return new User();
    }
}
