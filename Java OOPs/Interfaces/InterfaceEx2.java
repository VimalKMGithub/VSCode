package Interfaces;

interface interfaceA {
    void method1();
}

interface interfaceB {
    void method1();
}

// a class can implement multiple interfaces
class classA implements interfaceA, interfaceB {
    @Override
    public void method1() { // this methods present in both interfaces so we override it once here and it
                            // will be used for both interfaces
        System.out.println("method1 implementation.");
    }
}

public class InterfaceEx2 {

}