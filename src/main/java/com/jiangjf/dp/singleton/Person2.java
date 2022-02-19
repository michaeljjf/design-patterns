package com.jiangjf.dp.singleton;

/**
 * Singleton 单例模式
 * 和第一种效果类似，但是通过静态代码块来实现
 * 通过JVM来保证单例
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person2 {
    private static Person2 INSTANCE = null;

    static {
        INSTANCE = new Person2();
    }

    private Person2() {

    }

    public static Person2 getInstance() {
        return INSTANCE;
    }

    public void say() {
        System.out.println("通过静态代码块实现的单例模式");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person2.getInstance().hashCode());
            }).start();
        }
    }
}
