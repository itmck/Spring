package com.qf.spring.Proxy;

/**
 * Create by it_mck 2018/8/9 23:48
 *
 * @Description:被代理对象实现公共接口
 * @Version: 1.0
 */
public class TargetProxy implements ProxyInterface {

    @Override
    public void hello() {
        System.out.println("hello~~~~~~~~~~~");
    }

    @Override
    public void say() {
        System.out.println("say~~~~~~~~~~~~~~~");
    }
}
