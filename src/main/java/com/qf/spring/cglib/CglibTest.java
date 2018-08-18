package com.qf.spring.cglib;

/**
 * Create by it_mck 2018/8/10 0:23
 *
 * @Description:cglib动态代理测试
 * @Version: 1.0
 */
public class CglibTest {


    public static void main(String[] args) {


        //创建代理对象
        CglibProxy cglibProxy = new CglibProxy();
        TargetProxy proxy = (TargetProxy) cglibProxy.getProxy(TargetProxy.class);
        proxy.hello();
        proxy.say();

    }

}
