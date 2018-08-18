package com.qf.spring.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by it_mck 2018/8/10 0:17
 *
 * @Description:cglib动态代理
 * @Version: 1.0
 */
public class CglibProxy implements MethodInterceptor {


    private Enhancer enhancer = new Enhancer();
    //设置被代理对象
    public Object getProxy(Class clazz){

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        System.out.println("增强前-------");
        Object invoke = methodProxy.invokeSuper(object, objects);
        System.out.println("增强之后-----------");

        return invoke;
    }
}
