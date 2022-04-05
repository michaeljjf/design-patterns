package com.jiangjf.dp.iterator;

/**
 * 迭代器
 * 泛型中的字母可以随意取，但是取的有意义更好，几个常用字母的含义：
 * E Element
 * T Type
 * K Key
 * V value
 *
 * @author jiangjf
 * @date 2022/4/5
 */
public interface MyIterator<E> {
    /**
     * 是否有下一个元素
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     *
     * @return E
     */
    E next();
}
