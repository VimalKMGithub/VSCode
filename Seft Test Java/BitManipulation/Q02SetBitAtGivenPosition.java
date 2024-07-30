package BitManipulation;

public class Q02SetBitAtGivenPosition {
    public int setBit(int num, int pos) {
        return num | (1 << pos);
    }

    public static void main(String[] args) {
        Q02SetBitAtGivenPosition obj = new Q02SetBitAtGivenPosition();
        int num = 5;
        int pos = 1;
        System.out.println(obj.setBit(num, pos));
    }
}
