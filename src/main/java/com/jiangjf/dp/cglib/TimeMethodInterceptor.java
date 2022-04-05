package com.jiangjf.dp.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public class TimeMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("method start");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("method end");
        return invoke;
    }
}
