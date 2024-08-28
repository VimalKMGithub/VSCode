package Access;

public class InnerClassTestSamePack {
    void testICT1() {
        InnerClass innerClass = new InnerClass(); // possible to create object of outer class
        InnerClass.DefaultInnerClass defaultInnerClass = innerClass.new DefaultInnerClass(); // possible to create
                                                                                             // object of default inner
                                                                                             // class
        InnerClass.ProtectedInnerClass protectedInnerClass = innerClass.new ProtectedInnerClass(); // possible to create
                                                                                                   // object of
                                                                                                   // protected inner
                                                                                                   // class

        InnerClass.PublicInnerClass publicInnerClass = innerClass.new PublicInnerClass(); // possible to create
                                                                                          // object of public inner
                                                                                          // class
    }
}