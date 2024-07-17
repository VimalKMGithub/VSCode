package stack;

public class Runner {
    public static void main(String[] args) {
        // Stack stack = new ArrayBasedStack();
        Stack stack = new LinkedListBasedStack();
        stack.push(5);
        stack.push(9);
        stack.push(-1);
        stack.push(-10);
        stack.push(100);
        stack.print();
        System.out.println(stack.poll() + " is polled");
        System.out.println(stack.poll() + " is polled");
        stack.print();
        System.out.println(stack.top() + " is on top");
    }
}
