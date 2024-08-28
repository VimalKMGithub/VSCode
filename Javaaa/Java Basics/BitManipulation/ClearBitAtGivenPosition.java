package BitManipulation;

public class ClearBitAtGivenPosition {
    public int clearBit(int num, int position) {
        int bitMask = 1 << position;
        int bitMaskNot = ~bitMask;
        int result = num & bitMaskNot;
        return result;
    }

    public static void main(String[] args) {
        ClearBitAtGivenPosition solution = new ClearBitAtGivenPosition();
        int num = 5;
        System.out.println(solution.clearBit(num, 2));
    }
}
