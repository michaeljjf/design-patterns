package com.jiangjf.dp.proxy;

import java.util.Random;

/**
 * @author jiangjf
 * @date 2022/4/4
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank moving ......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
