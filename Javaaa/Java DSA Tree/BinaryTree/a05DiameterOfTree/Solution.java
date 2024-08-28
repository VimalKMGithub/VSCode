package BinaryTree.a05DiameterOfTree;

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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private class DiameterHeight {
        int diameter;
        int height;

        public DiameterHeight(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public int diameterOfBinaryTree2(TreeNode root) {
        return diameterOfBinaryTreeHelper(root).diameter;
    }

    private DiameterHeight diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null) {
            return new DiameterHeight(0, 0);
        }
        DiameterHeight left = diameterOfBinaryTreeHelper(root.left);
        DiameterHeight right = diameterOfBinaryTreeHelper(root.right);
        int height = 1 + Math.max(left.height, right.height);
        int diameter = Math.max(left.height + right.height, Math.max(left.diameter, right.diameter));
        return new DiameterHeight(diameter, height);
    }

    public int diameterOfBinaryTree3(TreeNode root) {
        int[] diameter = new int[1];
        diameterOfBinaryTreeHelper(root, diameter);
        return diameter[0];
    }

    private int diameterOfBinaryTreeHelper(TreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }
        int left = diameterOfBinaryTreeHelper(root.left, diameter);
        int right = diameterOfBinaryTreeHelper(root.right, diameter);
        diameter[0] = Math.max(diameter[0], left + right);
        return 1 + Math.max(left, right);
    }
}