package com.qf.spring.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by it_mck 2018/8/9 23:49
 *
 * @Description:创建动态代理对象
 * @Version: 1.0
 */
public class ProxyAdmin implements InvocationHandler {

    private Object target;

    public ProxyAdmin(Object target){

        this.target = target;

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //增强
        System.out.println("本地方法被增强------");
        //执行被代理对象的方法
        Object invoke = method.invoke(target, args);

        System.out.println("执行结束");

        return invoke;
    }
}
