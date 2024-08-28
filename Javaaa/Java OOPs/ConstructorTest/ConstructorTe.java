package ConstructorTest;

import Constructors.ConstructorsExample;

public class ConstructorTe {
    public static void main(String[] args) {
        // Default constructor
        /* ConstructorsExample ce1 = new ConstructorsExample(); */ // Error: ConstructorsExample() has package-private
                                                                   // access in ConstructorsExample

        // Public constructor with one parameter: 10
        ConstructorsExample ce2 = new ConstructorsExample(10); // access modifier is public

        // Private constructor
        /* ConstructorsExample ce3 = new ConstructorsExample(10, 20); */ // Error: ConstructorsExample(int, int) has
                                                                         // private access in ConstructorsExample

        // Protected constructor
        /* ConstructorsExample ce4 = new ConstructorsExample(10, 20, 30); */ // Error: ConstructorsExample(int, int,
                                                                             // int)
                                                                             // has protected access in
                                                                             // ConstructorsExample
    }
}

class TestC extends ConstructorsExample {
    public TestC() {
        // Protected constructor with three parameters: 10 20 30 of superclass
        // ConstructorsExample can be accessed in the same package and subclasses
        super(10, 20, 30);
    }
}