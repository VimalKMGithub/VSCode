package BinaryTree.a03SumOfNodes;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int x) {
            val = x;
        }
    }

    public int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public int sumOfNodesIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            sum += node.val;
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(15);

        System.out.println(s.sumOfNodes(root));
        System.out.println(s.sumOfNodesIterative(root));
    }
}