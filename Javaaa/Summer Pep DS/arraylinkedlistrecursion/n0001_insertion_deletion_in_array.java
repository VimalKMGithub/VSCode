public class n0001_insertion_deletion_in_array {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // insertion in an array
    private int insert(int[] arr, int length, int val, int index) {
        if (length == arr.length) {
            throw new IllegalArgumentException("Array is full");
        }
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("Invalid index");
        }
        int itr = length - 1;
        while (itr >= index) {
            arr[itr + 1] = arr[itr];
            itr--;
        }
        arr[index] = val;
        length++;
        return length;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // deletion in an array
    private int delete(int[] arr, int length, int index) {
        if (length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("Invalid index");
        }
        int itr = index;
        while (itr < length - 1) {
            arr[itr] = arr[itr + 1];
            itr++;
        }
        length--;
        return length;
    }
}