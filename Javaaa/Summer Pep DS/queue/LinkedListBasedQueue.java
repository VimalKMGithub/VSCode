package queue;

public class LinkedListBasedQueue implements Queue {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int sizeVal;

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public void push(int newVal) {
        addNewNodeAtTail(newVal);
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public Integer poll() {
        return removeValueFromHead();
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public Integer peek() {
        if (head == null) {
            return null;
        }
        return this.head.data;
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public int size() {
        return sizeVal;
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    private void addNewNodeAtTail(int newVal) {
        sizeVal++;
        Node newNode = new Node(newVal);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }

    private Integer removeValueFromHead() {
        if (head == null) {
            return null;
        }
        sizeVal--;
        Integer valueRemoved = head.data;
        this.head = head.next;
        if (head == null) {
            this.tail = null;
        }
        return valueRemoved;
    }
}