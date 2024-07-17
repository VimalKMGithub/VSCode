package FunctionsQuestions;

public class CheckArrayStrictlyIncreasing {
    public boolean checkArrayStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckArrayStrictlyIncreasing c = new CheckArrayStrictlyIncreasing();
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        System.out.println(c.checkArrayStrictlyIncreasing(arr));
    }
}