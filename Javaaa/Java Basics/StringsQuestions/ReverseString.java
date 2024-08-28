package StringsQuestions;

public class ReverseString {
    public String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char current = str.charAt(i);
            result.append(current);
        }
        return result.toString();
    }

    public String reverseString2nd(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            result.insert(0, current);
        }
        return result.toString();
    }

    public void reverseStringBuilder(StringBuilder str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int start = i;
            int end = str.length() - 1 - i;
            char frontChar = str.charAt(start);
            char backChar = str.charAt(end);
            str.setCharAt(start, backChar);
            str.setCharAt(end, frontChar);
        }
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        System.out.println(solution.reverseString("vimal"));
        System.out.println(solution.reverseString2nd("vimal"));
        StringBuilder str = new StringBuilder("vimal");
        solution.reverseStringBuilder(str);
        System.out.println(str);
    }
}