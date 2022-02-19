package com.jiangjf.dp.singleton;

import com.jiangjf.dp.util.MySleep;

/**
 * Singleton 单例模式
 * 饱汉式，用到才加载
 * 在getInstance方法内添加synchronized + 双层检查来实现
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Person5 {
    /**
     * volatile让线程间的变量修改可见
     */
    private static volatile Person5 INSTANCE = null;

    private Person5() {

    }

    public static Person5 getInstance() {
        // synchronized + 双层检查
        if (INSTANCE == null) {
            // 这里是不需要加锁的业务代码。。。，减少锁的范围来增加执行效率
            synchronized (Person5.class) {
                if (INSTANCE == null) {
                    MySleep.sleep(500);
                    INSTANCE = new Person5();
                }
            }
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("单例模式，在getInstance方法内添加synchronized + 双层检查来解决线程安全问题");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Person5.getInstance().hashCode());
            }).start();
        }
    }
}
