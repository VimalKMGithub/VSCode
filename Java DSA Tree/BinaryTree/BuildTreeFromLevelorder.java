package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreeFromLevelorder {
    private static class TreeNode {
        private Integer val;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(Integer[] levelorder) {
        if (levelorder.length == 0) {
            return null;
        }
        return buildTree(levelorder, 0);
    }

    private TreeNode buildTree(Integer[] levelorder, int index) {
        if (index >= levelorder.length || levelorder[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(levelorder[index]);
        root.left = buildTree(levelorder, 2 * index + 1);
        root.right = buildTree(levelorder, 2 * index + 2);
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public void levelorder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] levelorder = { 1, 2, 3, 4, 5, null, null, null, null, null, 6 };
        BuildTreeFromLevelorder sol = new BuildTreeFromLevelorder();
        TreeNode root = sol.buildTree(levelorder);
        sol.preorder(root);
        System.out.println();
        sol.inorder(root);
        System.out.println();
        sol.postorder(root);
        System.out.println();
        sol.levelorder(root);
    }
}