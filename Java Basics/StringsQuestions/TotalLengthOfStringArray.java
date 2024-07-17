package StringsQuestions;

public class TotalLengthOfStringArray {
    public int totalLengthOfStrArray(String[] arr) {
        int totalLength = 0;
        for (String string : arr) {
            totalLength += string.length();
        }
        return totalLength;
    }

    public static void main(String[] args) {
        TotalLengthOfStringArray solution = new TotalLengthOfStringArray();
        System.out.println(solution.totalLengthOfStrArray(new String[] { "Vimal", "Mishra" }));
    }
}