import java.util.*;
import java.util.LinkedList;

class myLinkedListed {
    Node head;

    myLinkedListed() {
        this.head = null;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class day9s {
    public static void main(String[] args) {
        // // 1st approach
        // LinkedList<Integer> ll = new LinkedList<>();
        // int a[] = { 1, 2, 3, 4, 5, 5, 6, 6, 7 };
        // for (int i : a) {
        // ll.add(i);
        // }
        // Iterator<Integer> ite = ll.iterator();
        // Integer prev = null, curr = null;
        // while (ite.hasNext()) {
        // curr = ite.next();
        // if (prev != null && curr.equals(prev)) {
        // ite.remove();
        // } else {
        // prev = curr;
        // }
        // }
        // System.out.println(ll);
        // // 2nd approach
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(1);
        // ll.add(2);
        // ll.add(2);
        // ll.add(3);
        // ll.add(4);
        // ll.add(4);
        // ll.add(4);
        // ll.add(4);
        // for (int i = 0; i < ll.size() - 1; i++) {
        // if (ll.get(i) == ll.get(i + 1)) {
        // ll.remove(i + 1);
        // i--;
        // }
        // }
        // System.out.println(ll);
        // // 3rd approach
        myLinkedListed ll = new myLinkedListed();
        ll.addNode(1);
        ll.addNode(1);
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(4);
        ll.printList();
        LinkedList<Integer> ll1 = new LinkedList<>();
    }
}
