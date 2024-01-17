import java.util.Scanner;

public class c0075_suduko {
    static int[][] b = new int[9][9];

    static boolean sa(int r, int c, int n) {
        for (int i = 0; i < 9; i++) {
            if (b[r][i] == n) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (b[i][c] == n) {
                return false;
            }
        }
        int nr = r - (r % 3), nc = c - (c % 3);
        for (int i = nr; i < nr + 3; i++) {
            for (int j = nc; j < nc + 3; j++) {
                if (b[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean ss(int r, int c) {
        if (r == 8 && c == 9) {
            return true;
        }
        if (c == 9) {
            r++;
            c = 0;
        }
        if (b[r][c] > 0) {
            return ss(r, c + 1);
        }
        for (int i = 1; i <= 9; i++) {
            if (sa(r, c, i)) {
                b[r][c] = i;
                if (ss(r, c + 1)) {
                    return true;
                } else {
                    b[r][c] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter elements row by row (enter '0' for blank)");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter elements of " + (i + 1) + " row : ");
            for (int j = 0; j < 9; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if (ss(0, 0)) {
            System.out.println("Solution");
            for (int i = 0; i < 9; i++) {
                System.out.print("| ");
                for (int j = 0; j < 9; j++) {
                    System.out.print(b[i][j] + " | ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
        sc.close();
    }
}