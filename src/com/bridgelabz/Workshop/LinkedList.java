package com.bridgelabz.Workshop;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;
    int size;


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }

    }

    public Node<T> search(T data) {
        Node<T> temp = head;
        Node<T> searchedNode = null;
        while (temp != null) {
            if (temp.key.compareTo(data) == 0) {
                searchedNode = temp;
                break;
            }
            temp = temp.next;
        }
        return searchedNode;
    }

    public boolean insert(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        boolean flag = false;
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            flag = true;
        }
        return flag;
    }
}




