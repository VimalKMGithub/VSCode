import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class s {
    boolean is(int ro, int co, char[][] b) {
        /* Horizontal */
        for (int i = 0; i < co; i++) {
            if (b[ro][i] == 'Q') {
                return false;
            }
        }
        /* Upperleft */
        for (int i = ro, j = co; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
        /* Lowerleft */
        for (int i = ro, j = co; i < b.length && j >= 0; i++, j--) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    void sv(char[][] b, List<List<String>> ab) {
        String r = "";
        List<String> nb = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            r = "";
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 'Q') {
                    r += "Q ";
                } else {
                    r += "X ";
                }
            }
            nb.add(r);
        }
        ab.add(nb);
    }

    void h(char[][] b, List<List<String>> ab, int c) {
        if (c == b.length) {
            sv(b, ab);
            return;
        }
        for (int i = 0; i < b.length; i++) {
            if (is(i, c, b)) {
                b[i][c] = 'Q';
                h(b, ab, c + 1);
                b[i][c] = 'x';
            }
        }
    }

    List<List<String>> so(int n) {
        List<List<String>> ab = new ArrayList<>();
        char[][] b = new char[n][n];
        h(b, ab, 0);
        return ab;
    }
}

public class c0074_n_Queens {
    public static void main(String[] args) {
        System.out.print("Enter number of queens (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.println("Possible combinations");
            s q = new s();
            List<List<String>> sb = q.so(n);
            for (int i = 0; i < sb.size(); i++) {
                System.out.println();
                System.out.println((i + 1) + ". way");
                for (int j = 0; j < sb.get(i).size(); j++) {
                    System.out.println(sb.get(i).get(j));
                }
            }
            System.out.println();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
