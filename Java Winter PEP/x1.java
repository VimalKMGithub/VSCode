/**
 * x1
 */
public class x1 {

    public static void main(String[] args) {
        String str = "i am student";
        String[] str1 = str.split(" ");
        System.out.println(str1.length);
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }
    }
}