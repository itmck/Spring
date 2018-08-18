package com.qf.spring.Proxy;

import java.lang.reflect.Proxy;

/**
 * Create by it_mck 2018/8/9 23:47
 *
 * @Description:
 * @Version: 1.0
 */
public class ProxyTest {


    public static void main(String[] args) {

        //测试JDK动态代理
        //创建被代理对象
        ProxyInterface myHello = new TargetProxy();

        ProxyInterface proxyInstance = (ProxyInterface)Proxy.
                newProxyInstance(myHello.getClass().getClassLoader(),
                myHello.getClass().getInterfaces(),
                new ProxyAdmin(myHello));

        proxyInstance.hello();
        proxyInstance.say();


    }
}
