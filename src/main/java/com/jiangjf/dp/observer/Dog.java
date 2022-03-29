package com.jiangjf.dp.observer;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class Dog implements Observer{

    public void bark() {
        System.out.println("狗叫汪汪汪...");
    }

    @Override
    public void action() {
        this.bark();
    }
}
