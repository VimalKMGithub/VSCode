package Final;

// Final keyword is used to create final variables, final methods, final classes, and final arguments. And the final variable value cannot be changed. And the final method cannot be overridden. And the final class cannot be inherited. And the final arguments cannot be changed. And the final variables are stored in the heap memory. And the final methods are stored in the method area. And the final classes are stored in the heap memory. And the final arguments are stored in the stack memory
class FinalVariable {
    final int x = 10;

    public void display() {
        // x = 20; // Error: cannot assign a value to final variable x
        System.out.println(x);
    }
}

class FinalMethod {
    // final method cannot be overridden in the child class
    final void display() {
        System.out.println("Final method");
    }
}

// final class cannot be inherited
final class FinalClass {
    public void display() {
        System.out.println("Final class");
    }
}

// Final arguments cannot be changed
class FinalArgument {
    public void display(final int x) {
        // x = 20; // Error: cannot assign a value to final variable x
        System.out.println(x);
    }
}

public class FinalKeyword {
}