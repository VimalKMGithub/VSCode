import java.util.Scanner;
import java.util.Stack;

public class StackUsingLL {
    private class Node {
        int data;
        Node link;
    }

    Node top;

    public StackUsingLL() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is Underflow! !");
            return;
        }
        top = top.link;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is Underflow! !");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.printf("%d -> ", temp.data);
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // Scanner sc = new Scanner(System.in);
        // int ele = sc.nextInt();
        // // while (ele != -1) {
        // // s.push(ele);
        // // System.out.println(s);
        // // ele = sc.nextInt();
        // // }
        // while (true) {
        // System.out.println("Enter your choice");
        // System.out.println("1: Push\n2: Pop\n3: Display\n4: Exit\n ");
        // int choice = sc.nextInt();
        // switch (choice) {
        // case 1: {
        // System.out.println("Enter the element: ");
        // ele = sc.nextInt();
        // s.push(ele);
        // break;
        // }
        // case 2: {
        // s.pop();
        // System.out.println("Top elemet is popped");
        // break;
        // }
        // case 3: {
        // System.out.println(s);
        // break;
        // }
        // case 4: {
        // sc.close();
        // System.exit(0);
        // }
        // default: {
        // System.out.println("Invalid choice!!");
        // }
        // }
        // }

        StackUsingLL stack = new StackUsingLL();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);

        stack.display();
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Stack after pop: ");
        stack.display();
    }
}
