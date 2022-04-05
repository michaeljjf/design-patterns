package com.jiangjf.dp.iterator;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public class Main {
    public static void main(String[] args) {
//        MyCollection<String> myCollection = new MyArrayList<>();
        MyCollection<String> myCollection = new MyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            myCollection.add("str" + i);
        }
        System.out.println(myCollection.size());
        MyIterator<String> myIterator = myCollection.getMyIterator();
        while (myIterator.hasNext()) {
            String next = myIterator.next();
            System.out.println(next);
        }
    }
}
