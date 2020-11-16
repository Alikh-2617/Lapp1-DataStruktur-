package com.company;

public class LinkedList {
    Node head;
    private int counter;

    public static class Node {
        Node next;
        Object data;

        public Node(Object value) {
            data = value;
            next = null;
        }

        public Object get() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }

    public int size() {
        return counter;
    }

    public Object get(int index) {
        if (index < 0) {
            return null;
        }
        if(index == 0){
            return head.data;
        }
        Node current;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return null;

                current = current.getNext();
            }
            return current.get();
        }
        return null;
    }

    public void add(Object value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node temp = new Node(value);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);

        counter++;
    }

    public void add(int index, Object data) {
        Node newNode = new Node(data);
        Node current;
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        current = head;
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());

        current.setNext(newNode);

        counter++;
    }

    public boolean empty() {
        return head == null;
    }

    public boolean contains(Object value) {
        Node now = head;
        while (now != null) {

            if (now.get().equals(value)) return true;
            now = now.getNext();

        }
        return false;
    }
    public void remove (int index){
        if(head == null){
            return;
        }

        if(index == 0) {
            head = head.getNext();
            return;
        }

        Node currentNode = head;
        for (int i = 0 ;i < index - 1 ; i ++){
            currentNode = currentNode.getNext();
            if(currentNode == null) {
                return;
            }
        }
        currentNode.setNext( currentNode.getNext().getNext());

    }
    public void prettyPrint(){
        System.out.print("LinkedList->");
        Node n = head;
        while(n != null){
            System.out.print("Node[" + n.data + "]->");
            n = n.next;
        }
        System.out.println();
    }
}