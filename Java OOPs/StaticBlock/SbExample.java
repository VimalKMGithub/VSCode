package StaticBlock;

// In Java, a static block (also known as a static initialization block) is used to initialize static variables or perform initialization tasks that are required before any instances of a class are created or any static methods are called. Static blocks are executed only once when the class is loaded into memory.
class test {
    static {
        System.out.println("Static block is invoked in test class");
    }
}

// 1. Execution Timing: Static blocks are executed when the class is first
// loaded by the JVM. This happens before any static methods or static variables
// of the class are accessed or before any instances of the class are created.

// 2. Usage: Static blocks are typically used for initializing static variables
// that require complex setup or for performing other one-time initialization
// tasks that need to be executed before the class is used.

// 3. Multiple Static Blocks: A class can have multiple static blocks. They are
// executed in the order they appear in the class.
public class SbExample {
    static {
        int x = 10;
        System.out.println("Static block is invoked");
    }

    static {
        System.out.println("Static block is invoked again");
    }

    public static void main(String[] args) {
        System.out.println("Hello main");
        test t = new test();
    }
}