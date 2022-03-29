package com.jiangjf.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class Baby {
    private boolean cry = false;
    private final List<Observer> observers = new ArrayList<>();

    public boolean isCry() {
        return cry;
    }

    public Baby add(Observer observer) {
        observers.add(observer);
        return this;
    }

    /**
     * 婴儿醒了
     */
    public void wakeUp() {
        cry = true;
        System.out.println("婴儿醒了...");
        for (Observer observer : observers) {
            observer.action();
        }
    }
}
