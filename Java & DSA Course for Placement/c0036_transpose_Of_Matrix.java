import java.util.Scanner;

public class c0036_transpose_Of_Matrix {
    static void c(int a[][]) {
        System.out.println("\nTranspose of matrix");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + " ");
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
