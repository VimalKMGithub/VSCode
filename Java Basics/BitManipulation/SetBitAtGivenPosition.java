package BitManipulation;

public class SetBitAtGivenPosition {
    public int setBit(int num, int position) {
        int bitMask = 1 << position;
        int result = num | bitMask;
        return result;
    }

    public static void main(String[] args) {
        SetBitAtGivenPosition solution = new SetBitAtGivenPosition();
        int num = 4;
        System.out.println(solution.setBit(num, 0));
    }
}