package AccessTest;

import Access.Methods;

public class MethodsTest {
    void testMTT1() {
        Methods methods = new Methods();
        methods.publicMethod(); // since it is public, it can be accessed from anywhere
        /* methods.protectedMethod(); */ // error: protectedMethod() has protected access in Access.Methods
                                         // only accessible from the same package and subclasses
        /* methods.packageMethod(); */ // error: packageMethod() has default access in Access.Methods
                                       // (package-private)
        /* methods.privateMethod(); */ /* error: private methods only accessed from same class */
    }
}

class TestMethods extends Methods {
    void testMTT2() {
        publicMethod(); // since it is public, it can be accessed from anywhere
        protectedMethod(); // since it is protected, it can be accessed from the same package and
                           // subclasses
        /* packageMethod(); */ // error: packageMethod() has default access in Access.Methods
                               // (package-private)
        /* privateMethod(); */ /* error: private methods only accessed from same class */
    }
}