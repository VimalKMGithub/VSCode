package AccessTest;

import Access.InnerClass;

// access acts recursively inside it means if field or method inside inner classes are protected, private, public or default they will act accordingly
public class InnerClassTest {
    void testICT1() {
        InnerClass innerClass = new InnerClass(); // possible to create object of outer class
        /*
         * InnerClass.DefaultInnerClass defaultInnerClass = innerClass.new
         * DefaultInnerClass();
         */ // error (not accessible because DefaultInnerClass is default (package-private))

        /*
         * InnerClass.ProtectedInnerClass protectedInnerClass = innerClass.new
         * ProtectedInnerClass();
         */ // error because protected is only accessible to other pack if we inerit top
            // class

        InnerClass.PublicInnerClass publicInnerClass = innerClass.new PublicInnerClass(); // possible to create object
                                                                                          // of public inner class
    }
}

class TestClass extends InnerClass {
    void testICT2() {
        PublicInnerClass publicInnerClass = new PublicInnerClass(); // possible to create object of public inner class
                                                                    // directly
        ProtectedInnerClass protectedInnerClass = new ProtectedInnerClass(); // possible to create object of protected
                                                                             // inner class directly
    }
}