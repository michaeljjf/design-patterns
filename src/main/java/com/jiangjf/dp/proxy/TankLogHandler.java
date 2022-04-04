package com.jiangjf.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 记录日志
 *
 * @author jiangjf
 * @date 2022/4/4
 */
public class TankLogHandler implements InvocationHandler {

    private final Movable m;

    public TankLogHandler(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记日志开始。。。");
        Object o = method.invoke(m, args);
        System.out.println("记日志结束。。。");
        return o;
    }
}
