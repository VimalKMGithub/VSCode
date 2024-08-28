import java.util.Scanner;

public class c0069_total_Paths_In_Maze {
    static int r, c;

    static int c(int i, int j) {
        if (i == r - 1 || j == c - 1) {
            return 1;
        }
        return c(i + 1, j) + c(i, j + 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows in matrix (natural number) : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.print("Enter number of columns in matrix (natural number) : ");
        c = sc.nextInt();
        sc.close();
        if (r >= 1 && c >= 1) {
            System.out.print("Total paths : " + c(0, 0));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
