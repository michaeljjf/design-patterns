package com.jiangjf.dp.observer;

/**
 * 观察者模式
 *
 * @author jiangjf
 * @date 2022/3/29
 */
public class Main {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.add(new Dog()).add(new Mom());
        baby.wakeUp();
    }
}
