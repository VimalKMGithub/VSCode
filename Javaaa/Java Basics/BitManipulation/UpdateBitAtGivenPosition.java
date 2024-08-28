package BitManipulation;

public class UpdateBitAtGivenPosition {
    public int updateBit(int num, int position, int updateTo) {
        int result;
        if (updateTo == 1) {
            SetBitAtGivenPosition temp = new SetBitAtGivenPosition();
            result = temp.setBit(num, position);
        } else {
            ClearBitAtGivenPosition temp = new ClearBitAtGivenPosition();
            result = temp.clearBit(num, position);
        }
        return result;
    }

    public static void main(String[] args) {
        UpdateBitAtGivenPosition solution = new UpdateBitAtGivenPosition();
        System.out.println(solution.updateBit(5, 1, 1));
    }
}