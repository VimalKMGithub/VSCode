import java.util.*;
import java.util.LinkedList;

public class day9 {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node removeDup(Node head) {
        Node dummy = new Node(head.data);
        Node Prev = dummy;
        while (head != null) {
            while (head.next != null && head.data == head.next.data) {
                head = head.next;
            }
            if (Prev.next == head) {
                Prev = Prev.next;
            } else {
                Prev.next = head.next;
            }
            head = head.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(4);
        ll.add(4);

        // Iterator i = ll.iterator();
        // while(i.hasNext()){

        // }
        for (int i = 0; i < ll.size() - 1; i++) {
            if (ll.get(i) == ll.get(i + 1)) {
                ll.remove(i + 1);
                i--;
            }
        }
        System.out.println(ll);
    }

}