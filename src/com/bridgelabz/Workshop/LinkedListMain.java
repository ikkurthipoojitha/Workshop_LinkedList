package com.bridgelabz.Workshop;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(24);
        linkedList.add(36);
        linkedList.print();

        linkedList.insert(24,32);
        linkedList.print();

    }
}
