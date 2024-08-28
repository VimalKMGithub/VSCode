package Q02MajorityElements;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public void printMajorityElements(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > len / 3) {
                System.out.println(i);
            }
        }
    }

    public ArrayList<Integer> getAllMajorityElements(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) > len / 3) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2 };
        solution.printMajorityElements(nums);
        System.out.println(solution.getAllMajorityElements(nums));
    }
}