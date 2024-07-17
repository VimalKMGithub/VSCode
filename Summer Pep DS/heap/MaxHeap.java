package heap;

public class MaxHeap {
    private int[] heapArray;
    private int heapSize;

    MaxHeap(int initialCapacity) {
        this.heapArray = new int[initialCapacity];
        this.heapSize = 0;
    }

    MaxHeap(int[] heapArray, int heapSize) {
        this.heapArray = heapArray;
        this.heapSize = heapSize;
        buildHeap();
    }

    public int getMax() {
        if (heapSize <= 0) {
            throw new RuntimeException("Heap is empty");
        }
        return heapArray[0];
    }

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public void add(int newValue) {
        if (heapSize == heapArray.length) {
            throw new RuntimeException("Heap is full!");
        }
        heapSize++;
        int indexOfAddingNewNode = heapSize - 1;
        heapArray[indexOfAddingNewNode] = newValue;
        while (indexOfAddingNewNode > 0 && heapArray[indexOfAddingNewNode] > heapArray[parent(indexOfAddingNewNode)]) {
            swap(indexOfAddingNewNode, parent(indexOfAddingNewNode));
            indexOfAddingNewNode = parent(indexOfAddingNewNode);
        }
    }

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int deleteByIndex(int index) {
        if (!(0 <= index && index < heapSize)) {
            throw new RuntimeException("Valid index not provided!");
        }
        int valueToBeDeleted = heapArray[index];
        swap(index, heapSize - 1);
        heapArray[heapSize - 1] = 0;
        heapSize--;
        heapify(index);
        return valueToBeDeleted;
    }

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int removeMax() {
        return deleteByIndex(0);
    }

    public void print() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heapArray[i] + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1), since we are useing iterative approach
    // Space Complexity: O(log n), when we are using recursive approach
    private void buildHeap() {
        int lastNonLeafNodeIndex = parent(heapSize - 1);
        for (int i = lastNonLeafNodeIndex; i >= 0; i--) {
            heapify(i);
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private void heapify(int i) {
        int maximumValueIndex = i;
        while (i < heapSize) {
            int leftChildIndex = left(i);
            int rightChildIndex = right(i);
            if (leftChildIndex < heapSize && heapArray[leftChildIndex] > heapArray[maximumValueIndex]) {
                maximumValueIndex = leftChildIndex;
            }
            if (rightChildIndex < heapSize && heapArray[rightChildIndex] > heapArray[maximumValueIndex]) {
                maximumValueIndex = rightChildIndex;
            }

            if (maximumValueIndex != i) {
                swap(i, maximumValueIndex);
                i = maximumValueIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 25, 20, 11, 15, 13, 12, 15, 19, 9, 8, 7, 7, 0 };
        MaxHeap maxHeap = new MaxHeap(arr, 12);
        maxHeap.print();
        maxHeap.add(200);
        maxHeap.print();
    }
}