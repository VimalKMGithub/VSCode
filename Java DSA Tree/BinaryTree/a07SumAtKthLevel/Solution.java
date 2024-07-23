package BinaryTree.a07SumAtKthLevel;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
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

public class Solution {
    public int sumAtKthLevel(TreeNode root, int k) {
        return sumAtKthLevel(root, k, 0);
    }

    private int sumAtKthLevel(TreeNode root, int k, int level) {
        if (root == null) {
            return 0;
        }
        if (level == k) {
            return root.val;
        }
        return sumAtKthLevel(root.left, k, level + 1) + sumAtKthLevel(root.right, k, level + 1);
    }

    public int sumAtKthLevelIterative(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode current = queue.poll();
                if (level == k) {
                    sum += current.val;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                size--;
            }
            level++;
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution solution = new Solution();
        System.out.println(solution.sumAtKthLevelIterative(root, 0));
    }
}