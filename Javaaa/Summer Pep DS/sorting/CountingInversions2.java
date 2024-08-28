package sorting;

public class CountingInversions2 {
    static class Result {
        int count;
        int[] sortedArray;

        public Result(int count, int[] sortedArray) {
            this.count = count;
            this.sortedArray = sortedArray;
        }
    }

    // Time complexity: O(n log n)
    // Space complexity: O(n log n)
    public int countInversions(int[] arr) {
        Result countInversionsResult = countInversions(arr, 0, arr.length - 1);
        return countInversionsResult.count;
    }

    public Result countInversions(int[] arr, int start, int end) {
        if (start > end) {
            return new Result(0, new int[] {});
        } else if (start == end) {
            return new Result(0, new int[] { arr[start] });
        }
        int mid = start + (end - start) / 2;
        Result countInversionsFirstHalf = countInversions(arr, start, mid);
        Result countInversionsSecondHalf = countInversions(arr, mid + 1, end);
        Result mergedResult = mergeForCountInversions(countInversionsFirstHalf.sortedArray,
                countInversionsSecondHalf.sortedArray);
        return new Result(countInversionsFirstHalf.count + countInversionsSecondHalf.count + mergedResult.count,
                mergedResult.sortedArray);
    }

    public Result mergeForCountInversions(int arr1[], int arr2[]) {
        int[] mergedSortedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0, count = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedSortedArray[k++] = arr1[i++];
            } else {
                count += arr1.length - i;
                mergedSortedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedSortedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedSortedArray[k++] = arr2[j++];
        }
        return new Result(count, mergedSortedArray);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 6, 5, 4, 3, 2, 1 };
        CountingInversions2 countInversions = new CountingInversions2();
        System.out.println(countInversions.countInversions(arr));
    }
}
