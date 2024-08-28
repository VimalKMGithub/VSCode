class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void findMiddle() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle of linked list is: " + slowPointer.data);
    }

    void findMiddle_2nd() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }
        System.out.println("Middle of linked list is: " + temp.data);
    }

    void deleteMiddle() {
        if (head == null || head.next == null) {
            System.out.println("Cannot delete middle. The linked list is NULL or has 1 node.");
            return;
        }
        Node slowPointer = head;
        Node fastPointer = head;
        Node prev = null;
        while (fastPointer != null && fastPointer.next != null) {
            prev = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        prev.next = slowPointer.next;
    }

    void deleteMiddle_2nd() {
        if (head == null || head.next == null) {
            System.out.println("Cannot delete middle. The linked list is NULL or has 1 node.");
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < (count / 2) - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void deleteMiddle_3rd() {
        if (head == null || head.next == null) {
            System.out.println("Cannot delete middle. The linked list is NULL or has 1 node.");
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        Node curr = head;
        for (int i = 0; i < count / 2; i++) {
            temp = curr;
            curr = curr.next;
        }
        temp.next = curr.next;
    }

    void insert(int data) {
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class day9n {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        // linkedList.insert(6);
        System.out.print("Input: ");
        linkedList.display();
        // linkedList.findMiddle();
        // linkedList.findMiddle_2nd();
        // linkedList.deleteMiddle();
        // linkedList.deleteMiddle_2nd();
        linkedList.deleteMiddle_3rd();
        linkedList.display();
    }
}
// Rahul is doing trying to make solve question on DSA where has to frequent
// insertion and deletion of elements from the List. Suggest Rahul which type of
// data Structure should he use.
// options
// A ArrayList
// B LinkedList [correct answer is B]
// C Stack
// D Queue

// What is the optimal time complexity to count the number of nodes in a linked
// list?
// options
// A O(N) [correct answer is A]
// B O(1)
// C O(N^2)
// D O(log N)

// which of the algorithm is not feasible for linkedlist?
// options
// 1: LinearSearch
// 2: MergeSort
// 3: BinarySearch [correct answer is 3]
// 4: QuickSort