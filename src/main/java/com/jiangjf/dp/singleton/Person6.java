package com.jiangjf.dp.singleton;

/**
 * Singleton 单例模式
 * 使用静态内部类实现，通过JVM来保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载的目的
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person6 {

    private Person6() {

    }

    private static class Person6Holder {
        private static final Person6 INSTANCE = new Person6();
    }

    public static Person6 getInstance() {
        return Person6Holder.INSTANCE;
    }

    public void say() {
        System.out.println("通过静态内部类实现的单例模式");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person6.getInstance().hashCode());
            }).start();
        }
    }
}
