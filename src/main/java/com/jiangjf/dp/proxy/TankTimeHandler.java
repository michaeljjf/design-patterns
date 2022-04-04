package com.jiangjf.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 记录执行时间
 *
 * @author jiangjf
 * @date 2022/4/4
 */
public class TankTimeHandler implements InvocationHandler {

    private final Movable m;

    public TankTimeHandler(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("执行时间开始");
        Object o = method.invoke(m, args);
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
        return o;
    }
}
