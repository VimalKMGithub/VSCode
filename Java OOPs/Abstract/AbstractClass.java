package Abstract;

// abstract class can have abstract methods and non-abstract methods
// we can also have inner abstract classes
abstract class Vimal {
    /* we can have variables in abstract class */
    /* variables can have all types of access modifiers */
    /* public variable */
    public int w = 10; /* we can choose wheather to initialize it or not */
    /* protected variable */
    protected int x = 20;
    /* private variable */
    private int y = 30;
    /* default variable package private */
    int z = 40;

    // abstract class can have a constructor just like a normal class
    /*
     * they also can have all types of access modifiers like public, protected,
     * private & default
     */
    public Vimal() {
        System.out.println("Constructor of Vimal class");
    }

    /* parameterized contructor */
    protected Vimal(int p1) {
    }

    private Vimal(int p2, int p3) {
    }

    /* constructor chaining */
    Vimal(int p4, int p5, int p6) {
        this(p4, p5); /* calling private constructor from here */
    }

    // abstract method can have three access modifiers: public, protected & default.
    // It cannot be private
    // And they follow the same rules as the methods in the normal class, as when
    // overriding the methods we can change the access modifier with certain
    // restrictions like we do in normal classes
    abstract public void run(); // abstract method (does not have a body)

    /* protected abstract method */
    abstract protected void run1();

    /* default abstract method */
    abstract void run2();

    /* but we cannot have private abstract method */
    /* abstract private void run3(); */ /* error */

    /* abstract class can also have static method */
    /* they can have any access modifiers */
    static public void display() {
        System.out.println("Static method");
    }

    /* static private method */
    static private void d1() {
    }

    /* static protected method */
    static protected void d2() {
    }

    /* static default package private method */
    static void d3() {
        d1(); /* calling static private method */
    }

    /* abstract class can have non abstract methods */
    // non-abstract method can have any access modifier and can have a body
    public void walk() { // non-abstract method
        System.out.println("Walking");
    }

    // non abstract private method
    private void sleep() {
        System.out.println("Sleeping");
    }

    /* non abstract protected method */
    protected void s2() {
    }

    /* non abstract default method */
    void s3() {
    }
}

// subclass (inherit from Vimal)
class CVimal extends Vimal {
    @Override
    public void run() {
        System.out.println("CVRunning");
    }

    public void CRun() {
        System.out.println("CRunning");
    }

    @Override
    protected void run1() {
    }

    @Override
    void run2() {
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        /* we cannot create object of abstract class directly */
        /* Vimal v1 = new Vimal(); */

        /*
         * if we want to create object of abstract class we have to implement all
         * unimplemented methods
         */
        Vimal v2 = new Vimal() {
            @Override
            public void run() {
            }

            @Override
            protected void run1() {
            }

            @Override
            void run2() {
            }
        };
        v2.run1();

        CVimal obj = new CVimal();
        obj.run();
        obj.walk();
        obj.CRun();

        /*
         * we can use reference of abstract or parent class to create object of child
         * but it comes with some restriction like we cannot call all methods of child
         * class
         */
        Vimal obj1 = new CVimal();
        obj1.run(); // Calls the overridden method in CVimal class, because JVM uses dynamic
                    // method dispatch to call the method. It doesn't matter which class reference
                    // is used to create the object. If the method is overridden in the derived
                    // class, then the overridden method will be called.
        obj1.walk(); // Calls the method in the base class if the method is not overridden in the
                     // derived class
        /* obj1.CRun(); */ // This will give an error as the method is not defined in the base class & we
                           // are using the base class reference to create the object of derived class

        /* Vimal obj2 = new Vimal(); */ // This will give an error as we cannot create an object of an abstract class
    }
}