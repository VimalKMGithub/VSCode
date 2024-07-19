package SinglyLinkedList;

public class SinglyLL {
    Node head;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void addAtIndex(int idx, String data) {
        if (idx < 0 || idx > getSize()) {
            System.out.println("Index out of bound.");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == getSize()) {
            addLast(data);
            return;
        }
        Node temp = head;
        while (idx != 1) {
            temp = temp.next;
            idx--;
        }
        Node newNode = new Node(data);
        Node tempNext = temp.next;
        temp.next = newNode;
        newNode.next = tempNext;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();
        sll.addFirst("Mishra");
        sll.addFirst("God");
        // sll.addFirst("Vimal");
        // sll.printList();

        // sll.addLast("Son");
        // sll.addLast("of");
        // sll.addLast("God");
        // sll.printList();

        // sll.deleteLast();
        // sll.printList();
        // System.out.println(sll.getSize());

        sll.printList();
        sll.addAtIndex(1, "Is");
        sll.printList();
    }
}