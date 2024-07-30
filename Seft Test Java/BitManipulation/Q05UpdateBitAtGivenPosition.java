package BitManipulation;

public class Q05UpdateBitAtGivenPosition {
    public int updateBit(int num, int pos, int bit) {
        int mask = ~(1 << pos);
        return (num & mask) | (bit << pos);
    }

    public static void main(String[] args) {
        Q05UpdateBitAtGivenPosition obj = new Q05UpdateBitAtGivenPosition();
        int num = 5;
        int pos = 2;
        int bit = 0;
        System.out.println(obj.updateBit(num, pos, bit));
    }
}
