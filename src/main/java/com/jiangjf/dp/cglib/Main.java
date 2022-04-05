package com.jiangjf.dp.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib实现动态代理（底层用的asm），要求被代理类不能是final
 *
 * @author jiangjf
 * @date 2022/4/5
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
