package com.jiangjf.dp.singleton;

import com.jiangjf.dp.util.MySleep;

/**
 * Singleton 单例模式
 * 饱汉式，用到才加载
 * 在getInstance方法上加synchronized
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person4 {
    private static Person4 INSTANCE = null;

    private Person4() {

    }

    public static synchronized Person4 getInstance() {
        if (INSTANCE == null) {
            MySleep.sleep(500);
            INSTANCE = new Person4();
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("单例模式，在getInstance方法上加synchronized解决线程安全问题");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person4.getInstance().hashCode());
            }).start();
        }
    }
}
