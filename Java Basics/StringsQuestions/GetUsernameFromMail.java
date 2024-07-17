package StringsQuestions;

public class GetUsernameFromMail {
    public String getUsername(String str) {
        return str.substring(0, str.indexOf("@"));
    }

    public static void main(String[] args) {
        GetUsernameFromMail solution = new GetUsernameFromMail();
        System.out.println(solution.getUsername("vimal@gmail.com"));
    }
}