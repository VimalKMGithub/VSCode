import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class x1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < a - 1; i++) {
            b.add(sc.nextInt());
        }
        sc.close();
        int k = 0;
        for (int i = 1; i <= a; i++) {
            if (!b.contains(i)) {
                k = i;
                break;
            }
        }
        System.out.println(k);
    }
}
