package BinaryTree.a02CountCompleteTreeNodes;

public class Solution {
    private static class TreeNode {
        private Integer val;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int x) {
            val = x;
        }
    }

    public int countNodes(TreeNode root) {
        int height = treeHeight(root);
        if (height == -1) {
            return 0;
        }

        int upperCount = (1 << height) - 1;
        int left = 0, right = upperCount;
        while (left < right) {
            int idxToFind = left + (right - left + 1) / 2;
            if (doesNodeExist(idxToFind, height, root)) {
                left = idxToFind;
            } else {
                right = idxToFind - 1;
            }
        }
        return upperCount + left + 1;
    }

    private int treeHeight(TreeNode root) {
        return root == null ? -1 : 1 + treeHeight(root.left);
    }

    private boolean doesNodeExist(int idx, int height, TreeNode node) {
        int left = 0, right = (1 << height) - 1;
        for (int i = 0; i < height; ++i) {
            int mid = left + (right - left) / 2;
            if (idx <= mid) {
                node = node.left;
                right = mid;
            } else {
                node = node.right;
                left = mid + 1;
            }
        }
        return node != null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(solution.countNodes(root));
    }
}