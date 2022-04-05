package com.jiangjf.dp.iterator;

/**
 * @author jiangjf
 * @date 2022/4/5
 */
public class MyLinkedList<E> implements MyCollection<E> {
    private Node head = null;
    private Node tail = null;

    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(E e) {
        Node n = new Node(e);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public MyIterator<E> getMyIterator() {
        return new MyLinkedListIterator<E>();
    }

    private class Node {
        private E o;
        Node next;

        public Node(E o) {
            this.o = o;
        }
    }

    private class MyLinkedListIterator<E> implements MyIterator<E> {
        Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E e = (E) currentNode.o;
            currentNode = currentNode.next;
            return e;
        }
    }
}
