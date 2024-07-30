package BitManipulation;

public class Q04ToggleBitAtGivenPosition {
    public int toggleBit(int num, int pos) {
        return num ^ (1 << pos);
    }

    public static void main(String[] args) {
        Q04ToggleBitAtGivenPosition obj = new Q04ToggleBitAtGivenPosition();
        int num = 5;
        int pos = 1;
        System.out.println(obj.toggleBit(num, pos));
    }
}
