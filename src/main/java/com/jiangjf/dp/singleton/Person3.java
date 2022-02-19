package com.jiangjf.dp.singleton;

import com.jiangjf.dp.util.MySleep;

/**
 * Singleton 单例模式
 * 饱汉式，用到才加载，但是这种情况下，存在线程安全问题
 * 有两种解决方式：
 * 1、在getInstance方法上加synchronized
 * 2、在getInstance方法内添加synchronized + 双层检查来实现
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person3 {
    private static Person3 INSTANCE = null;

    private Person3() {

    }

    public static Person3 getInstance() {
        if (INSTANCE == null) {
            MySleep.sleep(500);
            INSTANCE = new Person3();
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("单例模式，有线程安全问题");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person3.getInstance().hashCode());
            }).start();
        }
    }
}
