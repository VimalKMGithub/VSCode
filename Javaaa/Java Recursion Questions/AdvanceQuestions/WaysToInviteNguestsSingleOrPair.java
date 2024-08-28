package AdvanceQuestions;

public class WaysToInviteNguestsSingleOrPair {
    public int waysToInviteGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        return waysToInviteGuest(n - 1) + (n - 1) * waysToInviteGuest(n - 2);
    }

    public static void main(String[] args) {
        WaysToInviteNguestsSingleOrPair sol = new WaysToInviteNguestsSingleOrPair();
        System.out.println(sol.waysToInviteGuest(4));
    }
}