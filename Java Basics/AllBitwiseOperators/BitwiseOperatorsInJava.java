package AllBitwiseOperators;

/* Bitwise operators in Java are used to perform operations on individual bits of integers. These operators are useful in various low-level programming tasks, such as setting, clearing, or toggling bits, and they can lead to efficient code in certain situations. */
public class BitwiseOperatorsInJava {
    public void bitwiseAnd() {
        /* 1. Bitwise AND (&): */
        /*
         * This operator performs a logical AND operation on each pair of corresponding
         * bits of two numbers.
         * 
         * The result bit is 1 if both corresponding bits are 1, otherwise it is 0.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int b = 3; /* Binary: 0011 */
        int result = a & b; /* Binary: 0001 (result is 1) */
        System.out.println("Bitwise &: " + result);
    }

    public void bitwiseOr() {
        /* 2. Bitwise OR (|): */
        /*
         * This operator performs a logical OR operation on each pair of corresponding
         * bits of two numbers.
         * 
         * The result bit is 1 if at least one of the corresponding bits is 1, otherwise
         * it is 0.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int b = 3; /* Binary: 0011 */
        int result = a | b; /* Binary: 0111 (result is 7) */
        System.out.println("Bitwise |: " + result);
    }

    public void bitwiseXor() {
        /* 3. Bitwise XOR (^): */
        /*
         * This operator performs a logical XOR (exclusive OR) operation on each pair
         * of corresponding bits of two numbers.
         * 
         * The result bit is 1 if the corresponding bits are different, otherwise it is
         * 0.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int b = 3; /* Binary: 0011 */
        int result = a ^ b; /* Binary: 0110 (result is 6) */
        System.out.println("Bitwise ^: " + result);
    }

    public void bitwiseNot() {
        /* 4. Bitwise NOT (~): */
        /*
         * This operator is a unary operator that flips the bits of the number i.e., it
         * changes 1 to 0 and 0 to 1.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int result = ~a; /* Binary: 1010 (result is -6) */
        System.out.println("Bitwise ~: " + result);
    }

    public void bitwiseLeftShift() {
        /* 5. Bitwise Left Shift (<<): */
        /*
         * This operator shifts all the bits of a number to the left by a specified
         * number of positions.
         * 
         * The empty positions on the right are filled with zeros.
         * 
         * Each left shift corresponds to multiplying the number by 2.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int result = a << 1; /* Binary: 1010 (result is 10) */
        System.out.println("Bitwise <<: " + result);
    }

    public void bitwisRightShift() {
        /* 6. Bitwise Right Shift (>>): */
        /*
         * This operator shifts all the bits of a number to the right by a specified
         * number of positions.
         * 
         * For positive numbers, the empty positions on the left are filled with zeros.
         * 
         * For negative numbers, the empty positions on the left are filled with ones to
         * preserve the sign (sign-extension).
         * 
         * Each right shift corresponds to dividing the number by 2.
         */
        /* Example: */
        int a = 5; /* Binary: 0101 */
        int result = a >> 1; /* Binary: 0010 (result is 2) */
        System.out.println("Bitwise >>: " + result);
    }

    public void unsignedRightShift() {
        /* 7. Bitwise Unsigned Right Shift (>>>): */
        /*
         * This operator shifts all the bits of a number to the right by a specified
         * number of positions.
         * 
         * The empty positions on the left are filled with zeros.
         * 
         * This operator always fills the empty positions on the left with zeros,
         * regardless of the sign of the number.
         * 
         * This operator is used to shift right without sign extension.
         */
        /* Example: */
        int a = -5; /* Binary: 1111 1111 1111 1111 1111 1111 1111 1011 */
        int result = a >>> 1; /* Binary: 0111 1111 1111 1111 1111 1111 1111 1101 (result is 2147483645) */
        System.out.println("Bitwise >>>: " + result);
    }
}