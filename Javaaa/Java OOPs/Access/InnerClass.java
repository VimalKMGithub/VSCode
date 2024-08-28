package Access;

// Inner class can have all type of access modifiers
public class InnerClass {
    private class PrivateInnerClass {
        // accessible only within this class
    }

    class DefaultInnerClass {
    }

    protected class ProtectedInnerClass {
        public ProtectedInnerClass() {
            // this is given so we can create object of this class in another package if a
            // class extends this TopClass
        }
    }

    public class PublicInnerClass {
    }
}

class TestInnerClass {
    void testIN1() {
        InnerClass innerClass = new InnerClass(); // possible to create object of outer class
        InnerClass.DefaultInnerClass defaultInnerClass = innerClass.new DefaultInnerClass(); // possible to create
                                                                                             // object of default inner
                                                                                             // class
        InnerClass.ProtectedInnerClass protectedInnerClass = innerClass.new ProtectedInnerClass(); // possible to create
                                                                                                   // object of
                                                                                                   // protected inner
                                                                                                   // class
    }
}

class Test2 extends InnerClass {
    void testIN2() {
        DefaultInnerClass defaultInnerClass = new DefaultInnerClass(); // can create object of default inner class
                                                                       // directly from subclass
        ProtectedInnerClass protectedInnerClass = new ProtectedInnerClass(); // can create object of protected inner
                                                                             // class directly from subclass
        PublicInnerClass publicInnerClass = new PublicInnerClass(); // can create object of public inner class directly
                                                                    // from subclass
    }
}
