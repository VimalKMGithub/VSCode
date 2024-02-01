public class day16n {
    public static String largestOddSubstring(String s) {
        String maxOdd = String.valueOf(Integer.MIN_VALUE);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (Integer.parseInt(substring) % 2 == 1 && Integer.parseInt(substring) > Integer.parseInt(maxOdd)) {
                    maxOdd = substring;
                }
            }
        }
        return maxOdd;
    }

    public static void main(String[] args) {
        // String s1 = "504";
        // System.out.println(largestOddSubstring(s1));
        // String s2 = "2042";
        // System.out.println(largestOddSubstring(s2));

        // String str = "504";
        // int num = 0;
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // int n = Integer.parseInt(String.valueOf(c));
        // if (n % 2 != 0 && n > num) {
        // num = n;
        // }
        // }
        // if (num == 0) {
        // System.out.print("");
        // } else {
        // System.out.print(String.valueOf(num));
        // }
    }
}
