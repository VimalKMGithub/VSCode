package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreeFromPreorder {
    private static class TreeNode {
        private Integer val;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int x) {
            val = x;
        }
    }

    private int index = -1;

    public TreeNode buildTree(Integer[] preorder) {
        index++;
        if (index >= preorder.length || preorder[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);
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
        Integer[] preorder = { 1, 2, 4, null, null, 5, null, 6, null, null, 3 };
        BuildTreeFromPreorder obj = new BuildTreeFromPreorder();
        TreeNode root = obj.buildTree(preorder);
        obj.preorder(root);
        System.out.println();
        obj.inorder(root);
        System.out.println();
        obj.postorder(root);
        System.out.println();
        obj.levelorder(root);
    }
}