// enum seasons {
//     summer, winter, autum, spring, rainy;
// }

// enum seasons2 {
//     summer, winter, autum, spring, rainy;

//     public static void main(String[] args) {
//         for (seasons2 str : seasons2.values()) {
//             System.out.println(str);
//         }
//     }
// }

// public class day7 {
//     public enum seasons {
//         summer, winter, autum, spring, rainy;
//     }

//     public enum seasons2 {
//         summer(2), winter(4), autum(6), spring(8), rainy(10);

//         int val;

//         seasons2(int val) {
//             this.val = val;
//         }
//     }

//     public static void main(String[] args) {
//         // for (seasons str : seasons.values()) {
//         // System.out.println(str);
//         // }

//         // for (seasons2 str : seasons2.values()) {
//         //     System.out.println(str + " " + str.val);
//         // }
//         // seasons winter = seasons.winter;
//         // System.out.println(winter);

//         // // a c=new a(); // this will give error
//     }
// }

// class a{
//     private a(){

//     }
// }

import java.util.Optional;

public class day7 {

}

// enum colours {
// red, white, blue
// }

// class test {
// public static void main(String[] args) {
// colours c = colours.red;
// switch (c) {
// case red:
// System.out.println("RED");
// break;
// case white:
// System.out.println("WHITE");
// break;
// case blue:
// System.out.println("BLUE");
// break;
// default:
// break;
// }
// }
// }

// Autoboxing -> primitive to wrapper
// Unboxing -> wrapper to primitive

// class tes {
// public static void main(String[] args) {
// int i = 10; // primitive data type
// Integer j = 2; // this is an object, this is wrapper class
// Integer a = Integer.valueOf(i); // Autoboxing
// int b = j.intValue(); // Unboxing
// }
// }

// class te {
// public static void main(String[] args) {
// // String[] Arr = new String[5];
// // // String low = Arr[2].toLowerCase(); // give error since strings are null
// // System.out.println(low);

// // String[] ar = new String[5];
// // Optional<String> checknull = Optional.ofNullable(ar[2]);
// // if (checknull.isPresent()) {
// // String lowe = ar[2].toLowerCase();
// // System.out.println(lowe);
// // } else {
// // System.out.println("Value is null");
// // }

// String[] ar = new String[5];
// ar[2] = "HI how ARE you";
// Optional<String> checknull = Optional.ofNullable(ar[2]);
// checknull.ifPresent(System.out::println);
// System.out.println(checknull.get());
// String lc = ar[2].toLowerCase();
// System.out.println(lc);
// }
// }