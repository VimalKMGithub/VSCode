package queue.q1firstNegNumInKSizeWIndow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<Integer> firstNegativeNumberInKSizeWindow(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(arr[i]);
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(getFirstNegativeNum(queue));
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < 0) {
                queue.add(arr[i]);
            }
            if (arr[i - k] < 0) {
                queue.poll();
            }
            answer.add(getFirstNegativeNum(queue));
        }
        return answer;
    }

    private int getFirstNegativeNum(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return 0;
        } else {
            return queue.peek();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        System.out.println(solution.firstNegativeNumberInKSizeWindow(arr, k));
    }
}