package BitManipulation;

public class Q03ClearBitAtGivenPosition {
    public int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }

    public static void main(String[] args) {
        Q03ClearBitAtGivenPosition obj = new Q03ClearBitAtGivenPosition();
        int num = 5;
        int pos = 2;
        System.out.println(obj.clearBit(num, pos));
    }
}
