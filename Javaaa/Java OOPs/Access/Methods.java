package Access;

public class Methods {
    public void publicMethod() {
        System.out.println("publicMethod"); // accessible from anywhere
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod"); // accessible from the same package and subclasses
    }

    void packageMethod() {
        System.out.println("packageMethod"); // accessible from the same package
    }

    private void privateMethod() {
        System.out.println("privateMethod"); // accessible only from the same class
    }
}
