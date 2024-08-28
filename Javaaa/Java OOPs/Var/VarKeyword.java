package Var;

import java.util.ArrayList;
import java.util.HashMap;

/* var automatically infers the type of the variable from the value assigned to it. It must be initialized at the time of declaration. Var can only be used for local variables within methods, constructors, and initialization blocks. Cannot Be Used for Fields, Method Parameters, Return Types */
class test {
    /* public var a = 10; */ /* Error: 'var' is not allowed here */
    public void display() {
        var t = 10; /* allowed */
    }
    /* public var display(){ return 10; } */ /* Error: 'var' is not allowed here */
    /* public void display(var a){} */ /* Error: 'var' is not allowed here */

    public int returnValue(int a) {
        var b = 10; /* allowed */
        return b;
    }
}

public class VarKeyword {
    public static void main(String[] args) {
        /* Error: cannot infer type for local variable initializer */
        /* var x = null; */
        /* var y; */

        var a = 10; /* int */
        var b = 10.5; /* double */
        var c = "Hello"; /* String */
        var d = true; /* boolean */
        var e = 'A'; /* char */
        var f = 10L; /* long */
        var g = 10.5f; /* float */
        var h = 10.5d; /* double */

        var i = new int[] { 1, 2, 3, 4, 5 }; /* array */
        var j = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; /* 2D array */

        var k = new VarKeyword(); /* class object */
        var l = new VarKeyword[] { new VarKeyword(), new VarKeyword() }; /* array of class objects */

        var m = new Object() { /* anonymous class */
            public void display() {
                System.out.println("Hello from anonymous class");
            }
        };

        for (var n : i) { /* enhanced for loop */
            System.out.print(n + " ");
        }
        System.out.println();

        var list = new ArrayList<>(); /* ArrayList */
        list.add(1);
        list.add(2);
        list.add(3);
        for (var o : list) { /* enhanced for loop */
            System.out.print(o + " ");
        }
        System.out.println();

        var map = new HashMap<>(); /* HashMap */
        map.put(1, "One");
        map.put(2, "Two");
        map.put("3rd", 3); /* key and value can be of any type */

        for (var entry : map.entrySet()) { /* enhanced for loop */
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        var p = new test(); /* class object */
        var q = p.returnValue(10); /* can infer type from method return type */
    }
}