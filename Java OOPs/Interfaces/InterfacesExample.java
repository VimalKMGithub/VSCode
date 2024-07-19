package Interfaces;

// Interfaces are similar to classes but they only contain abstract methods and final variables. They are used to achieve abstraction and multiple inheritance. They are declared using the interface keyword. They can have all access modifiers. They cannot have constructors. They can extend multiple interfaces. They cannot extend classes. They can have default and static methods. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums. They can have nested interfaces. They can have nested classes. They can have nested enums.
// interface can have default or public access modifier, a public interface can be accessed from any other class, a default interface can be accessed only from classes in the same package.
interface MyInterface {
    // Fields are implicitly public, static, and final
    // You cannot have non final, non static & non public fields in an interface, by
    // default all fields are public, static and final
    int constant = 10;

    /* protected int protectedField = 20; */ // Compilation error
    /* private int privateField = 30; */ // Compilation error

    // Abstract method (implicitly public and abstract)
    // You cannot have non public abstract methods in an interface
    void abstractMethod();

    /* protected void protectedMethod(); */ // Compilation error
    /* private void privateMethod(); */ // Compilation error

    // Default method (implicitly public) we have to use default keyword to define
    // You cannot have non public default methods in an interface
    default void defaultMethod() {
        System.out.println("Default method implementation.");
    }

    /* default protected void defaultProtectedMethod() {} */ // Compilation error
    /* default private void defaultPrivateMethod() {} */ // Compilation error

    // we cannot have default static together, only one of abstract, default, or
    // static permitted
    /* default static void defaultStaticMethod() {} */ // Compilation error

    // we cannot have package private methods in an interface
    /* void another(){} */ // Compilation error

    // Static method (implicitly public)
    // You can have private static methods, but cannot have protected static
    static void staticMethod() {
        System.out.println("Static method in interface.");
    }

    /* static protected void staticProtectedMethod() {} */ // Compilation error
    // You can have private static methods
    static private void staticPrivateMethod() {
        System.out.println("Static private method in interface.");
    }

    // Private method (since Java 9)
    private void privateMethod() {
        System.out.println("Private method in interface.");
    }

    // Private static method (since Java 9)
    private static void privateStaticMethod() {
        System.out.println("Private static method in interface.");
    }
}

class Vimal1 implements MyInterface {
    @Override
    public void abstractMethod() { // must override the abstract method
        System.out.println("Abstract method implementation.");
    }

    // we can override the default method or use the default implementation
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method.");
    }

    void testT() {
        Vimal1 obj = new Vimal1();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
        /* MyInterface.staticPrivateMethod(); */ // Compilation error
        /* obj.privateMethod(); */ // Compilation error
        /* MyInterface.privateStaticMethod(); */ // Compilation error
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Vimal1 obj = new Vimal1();
        obj.testT();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
        /* MyInterface.staticPrivateMethod(); */ // Compilation error
        /* obj.privateMethod(); */ // Compilation error
        /* MyInterface.privateStaticMethod(); */ // Compilation error
    }
}