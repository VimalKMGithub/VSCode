package StringsQuestions;

public class ReplaceCharsWithAnotherGivenChars {
    public String replaceCharsInString(String str, char charToReplace, char charToReplaceWith) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == charToReplace) {
                result.append(charToReplaceWith);
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReplaceCharsWithAnotherGivenChars solution = new ReplaceCharsWithAnotherGivenChars();
        System.out.println(solution.replaceCharsInString("Vimal Mishra", 'i', 'e'));
    }
}