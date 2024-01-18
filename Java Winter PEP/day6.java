// public class day6 {
// static int dividebyzero(int a, int b) throws ArithmeticException {
// throw new ArithmeticException("");
// }

// // static int dividebyzero(int a, int b) {
// // int i = a / b;
// // return i;
// // }

// // static int callDivide(int a, int b) {
// // int val = 0;
// // try {
// // val = dividebyzero(a, b);
// // } catch (ArrayIndexOutOfBoundsException e) {
// // System.out.println("Array index out of bounds");
// // }
// // return val;
// // }

// final static int a = 10;
// static final int b = 20;

// public static void main(String[] args) {
// // int a = 5, b = 0;
// // try {
// // System.out.println(a / b);
// // } catch (ArithmeticException e) {
// // e.printStackTrace();
// // System.out.println(e);
// // System.out.println(e.getMessage());
// // } catch (Exception e) {
// // System.out.println(e.getMessage());
// // }

// // int a = 5, b = 0;
// // try {
// // int res = callDivide(a, b);
// // System.out.println(res);
// // } catch (ArithmeticException e) {
// // System.out.println(e.getMessage());
// // }

// // int a = 5, b = 0;
// // try {
// // int res = a / b;
// // System.out.println(res);
// // } catch (ArithmeticException e) {
// // System.out.println(e.getMessage());
// // } finally {
// // System.out.println("I'm still able to execute in finally");
// // }

// // int cars = 14;
// // if (cars < 15) {
// // throw new ArithmeticException("Cars not enough");
// // }
// // System.out.println("Hi");

// // try {
// // int res = dividebyzero(0, 0);
// // System.out.println(res);
// // } catch (Exception e) {
// // System.out.println(e.getMessage());
// // }
// // System.out.println("Bye");

// // try {
// // throw new myException("User defined exception");
// // } catch (Exception e) {
// // System.out.println(e.getMessage());
// // }

// // finalize -> garbage collection
// // day6 ob = new day6();
// // System.out.println(ob.hashCode());
// // ob = null;
// // System.gc();
// // System.out.println("garbage collected");

// // a=30; // error final cannot be changed
// // b=40; // error final cannot be changed
// }

// public void finalize() {
// System.out.println("in finalize");
// }
// }

// class myException extends Exception {
// public myException(String s) {
// super(s);
// }
// }

// import java.lang.annotation.ElementType;
// import java.lang.annotation.Inherited;
// import java.lang.annotation.Target;

// class car {
// void speed() {
// System.out.println("Speed of car");
// }
// }

// class BMW extends car {
// @Override
// void speed() {
// System.out.println("BMW");
// }
// }

// class day6t1 {
// @Deprecated
// void first() {
// }

// void second() {
// }
// }

// @interface myAnnotation {
// int res() default 0;
// }

// @Target(ElementType.TYPE)
// @interface myAnnotation2 {
// int res() default 0;
// }

// @Inherited
// @interface forAll {
// }

// @forAll
// class parent {
// }

// class child extends parent {
// }

// @myAnnotation2(res = 10)
// public class day6 {
// public static void main(String[] args) {
// @SuppressWarnings("unused")
// int b = 10;
// day6t1 t1 = new day6t1();
// t1.first(); // cross line while calling
// t1.second();
// }

// @myAnnotation(res = 5)
// void dummy() {
// }
// }

// generics
// generics are type safe

import java.util.*;

// T type
// E Element
// 

// generic class
class myClass<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }
}

public class day6 {
    public static void main(String[] args) {
        // List<String>li=new ArrayList<>();
        // li.add("abc");
        // String s=li.get(0);
        // System.out.println(li);

        // List li=new ArrayList<>();
        // li.add("abc");
        // li.add(1);
        // // String s=li.get(0); // give error because no type is given
        // System.out.println(li);

        // Map<Integer,String> map=new HashMap<>();
        // map.put(1, "one");
        // // map.put("2", "one"); // give error because of type mismatch

        Integer[] ar1 = { 1, 2, 3, 4 };
        Character[] ar2 = { 'a', 'b', 'c' };
        print(ar1);
        print(ar2);
    }

    // generic method
    public static <E> void print(E[] elements) {
        for (E e : elements) {
            System.out.println(e);
        }
        System.out.println();
    }
}