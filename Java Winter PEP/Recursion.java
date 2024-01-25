public class Recursion {
    static int fact(int n) {
        int res;
        if (n == 0 || n == 1) {
            return 1;
        }
        res = fact(n - 1) * n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
