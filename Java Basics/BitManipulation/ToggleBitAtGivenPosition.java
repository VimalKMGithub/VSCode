package BitManipulation;

public class ToggleBitAtGivenPosition {
    public int toggleBit(int num, int position) {
        int result;
        GetBitAtGivenPosition tempGetBit = new GetBitAtGivenPosition();
        int getBitAtPosition = tempGetBit.getBit(num, position);
        if (getBitAtPosition == 1) {
            ClearBitAtGivenPosition temp = new ClearBitAtGivenPosition();
            result = temp.clearBit(num, position);
        } else {
            SetBitAtGivenPosition temp = new SetBitAtGivenPosition();
            result = temp.setBit(num, position);
        }
        return result;
    }

    public static void main(String[] args) {
        ToggleBitAtGivenPosition solution = new ToggleBitAtGivenPosition();
        System.out.println(solution.toggleBit(5, 1));
    }
}