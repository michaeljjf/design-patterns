package com.jiangjf.dp.observer;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class Mom implements Observer{

    public void feed() {
        System.out.println("妈妈给婴儿喂吃的...");
    }

    @Override
    public void action() {
        this.feed();
    }
}
