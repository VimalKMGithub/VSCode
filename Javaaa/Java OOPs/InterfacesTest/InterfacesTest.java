package InterfacesTest;

/* import Interfaces.DefaultInterface; */ // error: DefaultInterface is not public in Interfaces; cannot be accessed from outside package
import Interfaces.PublicInterface; // access the public interface

class Vim2 implements PublicInterface {
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod implementation");
    }
}

public class InterfacesTest implements PublicInterface {
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod implementation");
    }
}
