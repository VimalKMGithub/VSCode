package tree.t5SumRootToLeafNums;

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

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbers(root, 0, 0);
    }

    private int sumNumbers(TreeNode root, int numSoFar, int totalSum) {
        if (root == null) {
            return totalSum;
        }
        int newNum = numSoFar * 10 + root.val;
        if (root.left == null && root.right == null) {
            return totalSum + newNum;
        }
        if (root.left != null) {
            totalSum = sumNumbers(root.left, newNum, totalSum);
        }
        if (root.right != null) {
            totalSum = sumNumbers(root.right, newNum, totalSum);
        }
        return totalSum;

        // if (root == null) {
        // return totalSum;
        // }
        // numSoFar = numSoFar * 10 + root.val;
        // if (root.left == null && root.right == null) {
        // return totalSum + numSoFar;
        // }
        // if (root.left != null) {
        // totalSum = sumNumbers(root.left, numSoFar, totalSum);
        // }
        // if (root.right != null) {
        // totalSum = sumNumbers(root.right, numSoFar, totalSum);
        // }
        // return totalSum;
    }

    public static void main(String[] args) {
        TreeNode five = new TreeNode(5);
        TreeNode one = new TreeNode(1);

        TreeNode nine = new TreeNode(9, five, one);
        TreeNode zero = new TreeNode(0);

        TreeNode root = new TreeNode(4, nine, zero);

        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));
    }
}