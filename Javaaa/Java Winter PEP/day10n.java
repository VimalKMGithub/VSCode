import java.util.Stack;

public class day10n {
    static void deleteMiddle_2(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int n = stack.size();
        int mid = n / 2;
        Stack<Integer> Stack = new Stack<>();
        for (int i = 0; i < mid; i++) {
            Stack.push(stack.pop());
        }
        stack.pop();
        while (!Stack.isEmpty()) {
            stack.push(Stack.pop());
        }
    }

    static void deleteMiddle(Stack<Integer> stack) {
        int size = stack.size();
        int mid = size / 2;
        deleteKth(stack, mid, 0);
        System.out.println("Stack after deleting middle element: " + stack);
    }

    static void deleteKth(Stack<Integer> stack, int k, int count) {
        if (count == k) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteKth(stack, k, count + 1);
        stack.push(temp);
    }

    public static void main(String[] args) {
        // int[] arr1 = { 10, 20, 30, 40, 50 };
        // Stack<Integer> stack = new Stack<>();
        // System.out.print("Array: ");
        // for (int integer : arr1) {
        // System.out.print(integer + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < arr1.length; i++) {
        // stack.push(arr1[i]);
        // }
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = stack.pop();
        // }
        // System.out.print("Reversed array: ");
        // for (int integer : arr1) {
        // System.out.print(integer + " ");
        // }

        // Stack<Integer> stack1 = new Stack<>();
        // stack1.push(1);
        // stack1.push(2);
        // stack1.push(3);
        // stack1.push(4);
        // stack1.push(5);
        // deleteMiddle(stack1);
        // // deleteMiddle_2(stack1);
        // // System.out.println(stack1);

        // Stack<Integer> stack2 = new Stack<>();
        // stack2.push(1);
        // stack2.push(2);
        // stack2.push(3);
        // stack2.push(4);
        // stack2.push(5);
        // stack2.push(6);
        // deleteMiddle(stack2);

        int Arr[] = { 4, 2, 1, 5, 3 };
        for (int i = 0; i < Arr.length - 1; i++) {
            if (Arr[i] > Arr[i + 1]) {
                Arr[i] = Arr[i + 1];
            } else {
                Arr[i] = -1;
            }
        }
        Arr[Arr.length - 1] = -1;
        for (int i : Arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
// In linked list implementation of a queue, where does a new element be
// inserted?
// options
// 1: At the head of link list
// 2: At the centre position in the link list
// 3: At the tail of the link list [correct answer is 3]
// 4: At any position in the linkedlist

// Which concept of element order stack follows.
// options
// 1: A FIFO
// 2: B LIFO [correct answer is B]

// In linked list implementation of a queue, from where is the item deleted?
// options
// 1: At the head of link list [correct answer is 1]
// 2: center
// 3: tail
// 4: none

// The essential condition which is checked before deletion in a linked queue is
// options
// 1: A OverFlow
// 2: B UnderFlow [correct answer is 2]
// 3: C Front Value
// 4: D Rear Value