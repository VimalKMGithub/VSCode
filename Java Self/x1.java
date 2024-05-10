import java.util.Scanner;

class x1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int st = sc.nextInt();
        System.out.print("Enter end: ");
        int en = sc.nextInt();
        System.out.print("Prime numbers: ");
        sc.close();
        int count = 0;
        for (int i = st; i <= en; i++) {
            boolean p = false;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    p = true;
                    break;
                }
            }
            if (p != true) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}