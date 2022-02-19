package com.jiangjf.dp.singleton;

/**
 * Singleton 单例模式
 * 饿汉式，一加载类就实例化，这种是简单也是最安全的实现方式，没有线程安全问题
 * 通过JVM来保证单例
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person1 {
    private static final Person1 INSTANCE = new Person1();

    private Person1() {

    }

    public static Person1 getInstance() {
        return INSTANCE;
    }

    public void say() {
        System.out.println("我是Singleton单例模式");
    }

    public static void main(String[] args) {
        Person1.getInstance().say();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person1.getInstance().hashCode());
            }).start();
        }
    }
}
