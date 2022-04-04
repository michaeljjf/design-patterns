package com.jiangjf.dp.proxy;

import java.lang.reflect.Proxy;

/**
 * 自己实现InvocationHandler，可以定义多个Handler，比如记录执行时间、记录日志等
 *
 * @author jiangjf
 * @date 2022/4/4
 */
public class Main2 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        // key是sun.misc.ProxyGenerator.saveGeneratedFiles还是jdk.proxy.ProxyGenerator.saveGeneratedFiles也依赖JDK版本，具体也是查看ProxyGenerator类中的静态常量saveGeneratedFiles
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TankTimeHandler(tank));
        Movable m2 = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TankLogHandler(m));
        m2.move();
    }
}
