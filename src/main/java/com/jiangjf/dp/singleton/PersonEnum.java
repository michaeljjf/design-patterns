package com.jiangjf.dp.singleton;

/**
 * 通过enum实现的单例，只是一种实现方式，实际编码不会使用
 * 不仅可以解决线程同步，还可以防止反序列化。
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public enum PersonEnum {
    /**
     * 只定义一个INSTANCE
     */
    INSTANCE;

    public void say() {
        System.out.println("通过enum实现的单例");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(PersonEnum.INSTANCE.hashCode());
            }).start();
        }
    }
}
