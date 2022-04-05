package com.jiangjf.dp.iterator;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public class MyArrayList<E> implements MyCollection<E> {
    E[] objects = (E[]) new Object[10];

    private int index = 0;

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public void add(E e) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = e;
        index++;
    }

    @Override
    public MyIterator<E> getMyIterator() {
        return new MyArrayListIterator<E>();
    }

    private class MyArrayListIterator<E> implements MyIterator<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public E next() {
            E o = (E) objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
