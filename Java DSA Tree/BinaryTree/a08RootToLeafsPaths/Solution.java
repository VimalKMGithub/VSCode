package BinaryTree.a08RootToLeafsPaths;

import java.util.ArrayList;
import java.util.List;

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
    public void rootToLeafPaths(TreeNode root) {
        if (root != null) {
            rootToLeafPaths(root, "");
        }
    }

    private void rootToLeafPaths(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            System.out.println(path + root.val);
            return;
        }
        if (root.left != null) {
            rootToLeafPaths(root.left, path + root.val + "->");
        }
        if (root.right != null) {
            rootToLeafPaths(root.right, path + root.val + "->");
        }
    }

    public List<String> rootToLeafPathsList(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            rootToLeafPathsList(root, "", paths);
        }
        return paths;
    }

    private void rootToLeafPathsList(TreeNode root, String path, List<String> paths) {
        if (root.left == null && root.right == null) {
            paths.add(path + root.val);
            return;
        }
        if (root.left != null) {
            rootToLeafPathsList(root.left, path + root.val + "->", paths);
        }
        if (root.right != null) {
            rootToLeafPathsList(root.right, path + root.val + "->", paths);
        }
    }
}