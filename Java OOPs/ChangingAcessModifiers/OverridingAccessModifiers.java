package ChangingAcessModifiers;

public class OverridingAccessModifiers {
    void p3() { /*
                 * if class from same package inherit it then we can do further implementation
                 * otherwise not
                 */
    }

    public void p() {
    }

    protected void p1() {
    }

    private void p4() { /* not possible in any case since private cannot be accessed outside class */
    }

    static public void p5() {
    }
}

class t1452 extends OverridingAccessModifiers {
    /*
     * @Override
     * private void p3() { // Cannot reduce the visibility of the inherited method
     * but can be upgraded
     * }
     */

    @Override
    protected void p3() { /*
                           * we can make it protected or public since it is upgrade from default, as p3
                           * method is in default mode in base class
                           */
    }

    @Override
    public void p1() { /* we can make it public, but not private or default */
    }

    /*
     * @Override
     * public void p5() {// cannot override a static method or change it accesss
     * modifiers
     * }
     */

    public void p6() {
        p5(); /* but static method get inherited according to access type, so we can use it */
    }
}