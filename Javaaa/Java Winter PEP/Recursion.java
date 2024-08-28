public class Recursion {
    static int fact(int n) {
        int res;
        if (n == 0 || n == 1) {
            return 1;
        }
        res = fact(n - 1) * n;
        return res;
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // public static void main(String[] args) {
    // // System.out.println(fact(5));

    // // int n = 10;
    // // System.out.println("Fibonacci Sequence up to " + n + " terms:");
    // // for (int i = 0; i < n; i++) {
    // // System.out.print(fibonacci(i) + " ");
    // // }
    // }

    // tailed recursion
    // static void execute(int n){
    // if (n<0) {
    // return;
    // }
    // System.out.println("vi");
    // execute(n-1);
    // }

    // indirect recursion call
    // fun1(){
    // fun2();
    // }
    // fun2(){
    // fun1();
    // }

    // delete a linked list using recursion
    static class node {
        int data;
        node next;
    }

    static void push(node head, int data) {
        node new_node = new node();
        new_node.data = data;
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        node head = new node();
        push(head, 1);
        push(head, 4);
        push(head, 3);
        push(head, 2);
        delete(head);
    }

    static void delete(node head) {
        if (head == null) {
            return;
        }
        delete(head.next);
        System.out.println("LL deleted");
        System.gc();
    }
}
