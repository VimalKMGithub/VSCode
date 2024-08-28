package BitManipulation;

public class IsGivenNumberIsInTwoPower {
    public boolean isInTwoPower(int num) {
        int tempNum = num - 1;
        int decisionValue = num & tempNum;
        if (decisionValue == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        IsGivenNumberIsInTwoPower solution = new IsGivenNumberIsInTwoPower();
        System.out.println(solution.isInTwoPower(128));
    }
}