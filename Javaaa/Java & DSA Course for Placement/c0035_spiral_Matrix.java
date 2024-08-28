import java.util.Scanner;

public class c0035_spiral_Matrix {
    static void c(int a[][]) {
        System.out.println("\nSpiral matrix");
        int rs = 0, re = a.length, cs = 0, ce = a[0].length;
        while (rs < re && cs < ce) {
            for (int i = cs; i < ce; i++) {
                System.out.print(a[rs][i] + " ");
            }
            rs++;
            for (int i = rs; i < re; i++) {
                System.out.print(a[i][ce - 1] + " ");
            }
            ce--;
            if (rs < re) {
                for (int i = ce - 1; i >= cs; i--) {
                    System.out.print(a[re - 1][i] + " ");
                }
                re--;
            }
            if (cs < ce) {
                for (int i = re - 1; i >= rs; i--) {
                    System.out.print(a[i][cs] + " ");
                }
                cs++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows of matrix (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter number of columns of matrix (natural number) : ");
        int m = sc.nextInt();
        if (n >= 1 && m >= 1) {
            int[][] a = new int[n][m];
            System.out.println("\nEnter elements of matrix");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nMatrix you entered");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();
            c(a);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
