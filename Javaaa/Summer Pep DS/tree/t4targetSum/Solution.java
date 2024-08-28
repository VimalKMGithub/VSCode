package tree.t4targetSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        List<Integer> targetSumPath = new ArrayList<>();
        boolean isSumPossible = hasPathSum(root, targetSum, 0, targetSumPath);
        Collections.reverse(targetSumPath);
        System.out.println(targetSumPath);
        return isSumPossible;
    }

    public boolean hasPathSum(TreeNode root, int targetSum, int sum, List<Integer> targetSumPath) {
        if (root.left == null && root.right == null && targetSum == sum + root.val) {
            targetSumPath.add(root.val);
            return true;
        }
        boolean isSumPossibleOnLeft = false;
        if (root.left != null) {
            isSumPossibleOnLeft = hasPathSum(root.left, targetSum, sum + root.val, targetSumPath);
        }
        boolean isSumPossibleOnRight = false;
        if (root.right != null) {
            isSumPossibleOnRight = hasPathSum(root.right, targetSum, sum + root.val, targetSumPath);
        }
        boolean isSumPossible = isSumPossibleOnLeft || isSumPossibleOnRight;
        if (isSumPossible) {
            targetSumPath.add(root.val);
        }
        return isSumPossible;
    }

    public static void main(String[] args) {
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1);

        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode thirteen = new TreeNode(13);
        TreeNode four = new TreeNode(4, null, one);

        TreeNode four2 = new TreeNode(4, eleven, null);
        TreeNode eigth = new TreeNode(8, thirteen, four);

        TreeNode root = new TreeNode(5, four2, eigth);

        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(root, 22));
    }
}