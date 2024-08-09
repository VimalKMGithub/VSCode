package Constructors;

public class ConstructorChaining {
    public ConstructorChaining() {
        System.out.println("Default Constructor");
    }

    public ConstructorChaining(int a) {
        this();
        System.out.println("Parameterized Constructor");
    }

    public ConstructorChaining(int a, int b) {
        this(a);
        /* this(); */ /*
                       * Error: Call to this must be first statement in constructor & can chain only
                       * one constructor
                       */
        System.out.println("Parameterized Constructor");
    }
}
