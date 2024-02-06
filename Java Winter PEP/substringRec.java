public class substringRec {
    static int countSubWithSameFirstLastChar(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int countSubWithSameFirstLastChar2(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubWithSameFirstLastChar2(str, i + 1, j, n - 1)
                + countSubWithSameFirstLastChar2(str, i, j - 1, n - 1)
                - countSubWithSameFirstLastChar2(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        // String str = "abcab";
        // System.out.println(countSubWithSameFirstLastChar(str));

        String str = "abcab";
        System.out.println(countSubWithSameFirstLastChar2(str, 0, str.length() - 1, str.length()));
    }
}
