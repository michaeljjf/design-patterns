package com.jiangjf.dp.builder;

import java.math.BigDecimal;

/**
 * @author jiangjf
 * @date 2022/4/9
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .basicInfo(1, "张三", 18)
//                .score(BigDecimal.valueOf(85.5))
                .loc("深圳", "xx路xx号")
                .build();
        System.out.println(person);
    }
}
