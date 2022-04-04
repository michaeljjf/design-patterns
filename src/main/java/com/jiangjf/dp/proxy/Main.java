package com.jiangjf.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用匿名内部类实现
 *
 * @author jiangjf
 * @date 2022/4/4
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("method start");
                        Object o = method.invoke(tank, args);
                        System.out.println("meth end");
                        return o;
                    }
                });
        m.move();
    }
}
