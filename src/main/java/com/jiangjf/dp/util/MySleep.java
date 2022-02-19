package com.jiangjf.dp.util;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class MySleep {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
