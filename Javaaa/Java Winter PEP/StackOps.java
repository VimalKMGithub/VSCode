import java.util.Scanner;

class Stack {
    int top;
    int[] arr = new int[10];

    Stack() {
        top = -1;
    }

    boolean push(Scanner sc) {
        if (top == 9) {
            System.out.println("Stack overflow!!");
            return false;
        } else {
            System.out.println("Enter value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("value pushed");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Stack UnderFlow!!");
            return false;
        } else {

            top--;
            System.out.println("value popped");
            return true;
        }
    }

    void peek() {
        if (top != -1) {
            System.out.println(arr[top]);
        } else {
            System.out.println("Stack empty");

        }
    }

}

public class StackOps {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while (choice != 4) {
            System.out.println("Enter your choice");
            System.out.println("1: Push\n2: Pop\n3: Peek\n4: Exit\n ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.peek();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice!!");
                }
            }
        }
    }
}