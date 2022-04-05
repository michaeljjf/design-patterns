package com.jiangjf.dp.cglib;

import java.util.Random;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public class Tank {
    public void move() {
        System.out.println("Tank moving ......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
