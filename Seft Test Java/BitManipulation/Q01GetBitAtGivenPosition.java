package BitManipulation;

public class Q01GetBitAtGivenPosition {
    public int getBit(int num, int pos) {
        return (num & (1 << pos)) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Q01GetBitAtGivenPosition obj = new Q01GetBitAtGivenPosition();
        int num = 5;
        int pos = 1;
        System.out.println(obj.getBit(num, pos));
    }
}
