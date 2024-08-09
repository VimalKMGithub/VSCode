package AccessTest;

import Access.Fields;

public class FieldsTest {
    void testFTT1() {
        Fields fields = new Fields();
        System.out.println(fields.publicField); // since it it public, it can be accessed from anywhere
        /* System.out.println(fields.protectedField); */ // error: protectedField has protected access in Access.Fields
                                                         // only accessible from the same package and subclasses
        /* System.out.println(fields.packageField); */ // error: defaultField has default access in Access
                                                       // (package-private)
        /* System.out.println(fields.privateField); */ /* error: private fields can only be acccessed from same class */
    }
}

class TestFields extends Fields {
    void testFTT2() {
        System.out.println(publicField); // since it it public, it can be accessed from anywhere
        System.out.println(protectedField); // since it is protected, it can be accessed from the same package and
                                            // subclasses
        /* System.out.println(packageField); */ // error: defaultField has default access in Access
                                                // (package-private)
        /* System.out.println(privateField); */ /* error: private fields can only be acccessed from same class */
    }
}