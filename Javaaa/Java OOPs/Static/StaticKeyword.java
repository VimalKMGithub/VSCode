package Static;

// Static keyword is used to create class level variables methods & static inner classes. And an instance of the class is not required to access them. And they are shared among all the objects of the class. And they are loaded when the class is loaded and destroyed when the class is unloaded from the memory. And they can be accessed using the class name. And they are not stored in the heap memory, they are stored in the method area. And they are not stored in the object memory. And they are not stored in the stack memory
class StaticKeywordExample {
    static int a = 10;

    static void display() {
        System.out.println("Static method");
    }

    static class InnerClass {
        void innerDisplay() {
            System.out.println("Static inner class");
        }
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(StaticKeywordExample.a); // directly accessing the static variable using class name if they
                                                    // are not private or restricted in any way
        StaticKeywordExample.display(); // directly accessing the static method using class name if they are not private
                                        // or restricted in any way
        StaticKeywordExample.InnerClass innerClass = new StaticKeywordExample.InnerClass(); // creating an instance of
                                                                                            // the static inner class
        innerClass.innerDisplay();
    }
}