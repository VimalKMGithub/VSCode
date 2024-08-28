package Constructors;

// Constructors are special methods that are called when an object is created. They are used to initialize the object's state. They have all access modifiers and do not have a return type. They have the same name as the class. If a class does not have a constructor, the compiler will automatically create a default constructor. If a class has a constructor, the compiler will not create a default constructor. Constructors can be overloaded.
public class ConstructorsExample {
    // Default constructor package-private access modifier can be accessed in the
    // same package
    ConstructorsExample() {
        System.out.println("Default constructor");
    }

    // Public constructor with one parameter can be accessed anywhere
    public ConstructorsExample(int x) {
        System.out.println("Constructor with one parameter: " + x);
    }

    // Private constructor with two parameters can only be accessed in the same
    // class
    private ConstructorsExample(int x, int y) {
        System.out.println("Constructor with two parameters: " + x + " " + y);
    }

    // Protected constructor with three parameters can be accessed in the same
    // package and subclasses
    protected ConstructorsExample(int x, int y, int z) {
        System.out.println("Constructor with three parameters: " + x + " " + y + " " + z);
    }
}