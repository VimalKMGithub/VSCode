package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinHeap {
    private int[] heapArray;
    private int heapSize;

    MinHeap(int initialCapacity) {
        this.heapArray = new int[initialCapacity];
        this.heapSize = 0;
    }

    MinHeap(int[] heapArray, int heapSize) {
        this.heapArray = heapArray;
        this.heapSize = heapSize;
        buildHeap();
    }

    public int getMin() {
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
        while (indexOfAddingNewNode > 0 && heapArray[indexOfAddingNewNode] < heapArray[parent(indexOfAddingNewNode)]) {
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
    public int removeMin() {
        return deleteByIndex(0);
    }

    public void print() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heapArray[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return heapSize;
    }

    public boolean isEmpty() {
        return size() == 0;
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
    // Space Complexity: O(log n)
    private void heapifyRecursive(int i) {
        int minimumValueIndex = i;
        int leftChildIndex = left(i);
        int rightChildIndex = right(i);
        if (leftChildIndex < heapSize && heapArray[leftChildIndex] < heapArray[minimumValueIndex]) {
            minimumValueIndex = leftChildIndex;
        }
        if (rightChildIndex < heapSize && heapArray[rightChildIndex] < heapArray[minimumValueIndex]) {
            minimumValueIndex = rightChildIndex;
        }
        if (minimumValueIndex != i) {
            swap(i, minimumValueIndex);
            heapify(minimumValueIndex);
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private void heapify(int i) {
        int minimumValueIndex = i;
        while (i < heapSize) {
            int leftChildIndex = left(i);
            int rightChildIndex = right(i);
            if (leftChildIndex < heapSize && heapArray[leftChildIndex] < heapArray[minimumValueIndex]) {
                minimumValueIndex = leftChildIndex;
            }
            if (rightChildIndex < heapSize && heapArray[rightChildIndex] < heapArray[minimumValueIndex]) {
                minimumValueIndex = rightChildIndex;
            }

            if (minimumValueIndex != i) {
                swap(i, minimumValueIndex);
                i = minimumValueIndex;
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
        // int[] arr = new int[] { 25, 20, 11, 15, 13, 12, 15, 19, 9, 8, 7, 7, 0 };
        // MinHeap minHeap = new MinHeap(arr, 12);
        // minHeap.print();
        // minHeap.add(2);
        // minHeap.print();

        // Arrays.sort(arr); // sorts arrays
        // System.out.println(Arrays.toString(arr));

        List<Integer> sortedNums = new ArrayList<>(Arrays.asList(25, 20, 11, 15, 13, 12, 15, 19, 9, 8, 7, 7));
        // sortedNums.sort(null); // sort list
        // Collections.sort(sortedNums); // sort collection
        System.out.println(sortedNums);
    }

    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)
    public static void heapSort() {
        int[] arr = new int[] { 25, 20, 11, 15, 13, 12, 15, 19, 9, 8, 7, 7, 0 };
        MinHeap minHeap = new MinHeap(arr, 12);
        List<Integer> sortedNums = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            sortedNums.add(minHeap.removeMin());
        }
        System.out.println(sortedNums);
    }

    public List<Integer> heapSort(int[] arr) {
        MinHeap minHeap = new MinHeap(arr, arr.length);
        List<Integer> sortedNums = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            sortedNums.add(minHeap.removeMin());
        }
        return sortedNums;
    }
}