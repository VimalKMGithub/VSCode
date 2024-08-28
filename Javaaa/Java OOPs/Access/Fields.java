package Access;

public class Fields {
    public int publicField = 1; // accessible from anywhere
    protected int protectedField = 2; // accessible from the same package and subclasses
    int packageField = 3; // accessible from the same package
    private int privateField = 4; // accessible only from the same class
}