package FunctionsQuestions;

public class HighestCommonFactorTwoNumbers {
    public int hcfTwoNumbers(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        HighestCommonFactorTwoNumbers hcf = new HighestCommonFactorTwoNumbers();
        int num1 = 12;
        int num2 = 18;
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf.hcfTwoNumbers(num1, num2));
    }
}