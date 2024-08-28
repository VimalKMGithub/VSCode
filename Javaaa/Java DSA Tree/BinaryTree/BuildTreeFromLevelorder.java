package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public TreeNode buildTreeIterative(Integer[] levelorder) {
        if (levelorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(levelorder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < levelorder.length) {
            TreeNode current = queue.poll();
            if (levelorder[index] != null) {
                current.left = new TreeNode(levelorder[index]);
                queue.add(current.left);
            }
            index++;
            if (index < levelorder.length && levelorder[index] != null) {
                current.right = new TreeNode(levelorder[index]);
                queue.add(current.right);
            }
            index++;
        }
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

    public void preorderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.val + " ");
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void inorderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public void postorderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> output = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            output.push(current.val);
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        while (!output.isEmpty()) {
            System.out.print(output.pop() + " ");
        }
    }

    public void levelorderIterative(TreeNode root) {
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
        TreeNode rootIterative = sol.buildTreeIterative(levelorder);

        // sol.preorder(root);
        // System.out.println();
        // sol.preorderIterative(root);
        // System.out.println();
        // sol.preorder(rootIterative);
        // System.out.println();
        // sol.preorderIterative(rootIterative);
        // System.out.println();

        // sol.inorder(root);
        // System.out.println();
        // sol.inorderIterative(root);
        // System.out.println();
        // sol.inorder(rootIterative);
        // System.out.println();
        // sol.inorderIterative(rootIterative);
        // System.out.println();

        // sol.postorder(root);
        // System.out.println();
        // sol.postorderIterative(root);
        // System.out.println();
        // sol.postorder(rootIterative);
        // System.out.println();
        // sol.postorderIterative(rootIterative);
        // System.out.println();

        sol.levelorderIterative(root);
        System.out.println();
        sol.levelorderIterative(rootIterative);
        System.out.println();
    }
}