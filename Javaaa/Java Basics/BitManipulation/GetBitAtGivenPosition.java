package BitManipulation;

public class GetBitAtGivenPosition {
    public int getBit(int num, int position) {
        int result;
        int bitMask = 1 << position;
        int temp = num & bitMask;
        if (temp == 0) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        GetBitAtGivenPosition solution = new GetBitAtGivenPosition();
        System.out.println(solution.getBit(5, 2));
    }
}