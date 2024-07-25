package Q02Mergetwosortedlinkedlists;

import java.util.Scanner;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummy;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                current.next = headA;
                headA = headA.next;
            } else {
                current.next = headB;
                headB = headB.next;
            }
            current = current.next;
        }
        if (headA != null) {
            current.next = headA;
        } else {
            current.next = headB;
        }
        return dummy.next;
    }

    public static SinglyLinkedListNode createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        SinglyLinkedListNode head = new SinglyLinkedListNode(values[0]);
        SinglyLinkedListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new SinglyLinkedListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] valuesA = new int[n];
            for (int j = 0; j < n; j++) {
                valuesA[j] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int[] valuesB = new int[m];
            for (int j = 0; j < m; j++) {
                valuesB[j] = scanner.nextInt();
            }
            SinglyLinkedListNode headA = createLinkedList(valuesA);
            SinglyLinkedListNode headB = createLinkedList(valuesB);
            SinglyLinkedListNode mergedHead = mergeLists(headA, headB);
            printLinkedList(mergedHead);
        }
        scanner.close();
    }
}