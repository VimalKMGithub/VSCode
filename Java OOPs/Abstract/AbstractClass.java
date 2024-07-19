package Abstract;

// abstract class can have abstract methods and non-abstract methods
// we can also have inner abstract classes
abstract class Vimal {
    // abstract class can have a constructor just like a normal class
    public Vimal() {
        System.out.println("Constructor of Vimal class");
    }

    // abstract method can have three access modifiers: public, protected & default.
    // It cannot be private
    // And they follow the same rules as the methods in the normal class, as when
    // overriding the methods we can change the access modifier with certain
    // restrictions like we do in normal classes
    abstract public void run(); // abstract method (does not have a body)

    // abstract method can have static keyword but it cannot have the abstract
    // keyword
    static public void display() {
        System.out.println("Static method");
    }

    // non-abstract method can have any access modifier and can have a body
    public void walk() { // non-abstract method
        System.out.println("Walking");
    }

    // non abstract private method
    private void sleep() {
        System.out.println("Sleeping");
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
}

public class AbstractClass {
    public static void main(String[] args) {
        CVimal obj = new CVimal();
        obj.run();
        obj.walk();
        obj.CRun();

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