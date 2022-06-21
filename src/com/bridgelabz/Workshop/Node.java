package com.bridgelabz.Workshop;

public class Node<T> {
    T key;

    Node<T> next;

    Node() {
    }

    Node(T key) {
        this.key = key;
    }



    public T getKey() {

        return key;
    }


    public void setKey(T key) {

        this.key = key;
    }


    public Node<T> getNext() {

        return next;
    }


    public void setNext(Node<T> next) {
        this.next = (Node<T>) next;
    }
}

