package Inheritence;

// import Bank.*; // This will import all the classes from the Bank package
// import Bank.Bank; // This will import the Bank class from the Bank package

// import Inheritence.Bank2.*; // This will import all the classes from the Bank2 package
// import Inheritence.Bank2.Bank2; // This will import the Bank2 class from the Bank2 package

/* In Java, when you override a method in a subclass, you can change the access modifier, but with certain restrictions. The overriding method cannot have a more restrictive access level than the method in the superclass. Here are the rules:

1. Public Methods: A public method in the superclass must be overridden by a public method in the subclass.
2. Protected Methods: A protected method in the superclass can be overridden by a protected or public method in the subclass.
3. Default (Package-Private) Methods: A default (package-private) method in the superclass can be overridden by a default, protected, or public method in the subclass.
4. Private Methods: Private methods in the superclass cannot be overridden because they are not accessible to subclasses. However, a method with the same name in the subclass would be a new, distinct method. */
class Shape {
    public void area() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void area() {
        // super.area(); // Calls the base class method
        System.out.println("Area of Rectangle");
    }

    public void area(int length, int breadth) {
        System.out.println(length * breadth);
    }
}

public class BasicInheritence {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area(10, 20);
        rectangle.area();

        Shape sRectShape = new Rectangle();
        /* sRectShape.area(10,20); */ // This will give an error as the method is not defined in the base class & we
                                      // are using the base class reference to create the object of derived class
        sRectShape.area(); // Calls the overridden method in Rectangle class, because JVM uses dynamic
                           // method dispatch to call the method. It doesn't matter which class reference
                           // is used to create the object. If the method is overridden in the derived
                           // class, then the overridden method will be called.
    }
}