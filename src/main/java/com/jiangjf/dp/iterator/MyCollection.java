package com.jiangjf.dp.iterator;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public interface MyCollection<E> {
    /**
     * 集合元素的数量
     */
    int size();

    /**
     * 添加元素到集合
     *
     * @param e {@link E}
     */
    void add(E e);

    /**
     * 获取迭代器
     *
     * @return {@link MyIterator<E>}
     */
    MyIterator<E> getMyIterator();
}
