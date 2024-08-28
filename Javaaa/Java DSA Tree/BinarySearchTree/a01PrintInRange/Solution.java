package BinarySearchTree.a01PrintInRange;

public class Solution {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public void printInRangeIterative(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        Node current = root;
        while (current != null) {
            if (current.left == null) {
                if (current.data >= k1 && current.data <= k2) {
                    System.out.print(current.data + " ");
                }
                current = current.right;
            } else {
                Node pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    if (current.data >= k1 && current.data <= k2) {
                        System.out.print(current.data + " ");
                    }
                    current = current.right;
                }
            }
        }
    }
}