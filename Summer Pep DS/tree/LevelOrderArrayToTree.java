package tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderArrayToTree {
    public static class Node {
        Integer data;
        Node left, right;

        Node(Integer data) {
            this.data = data;
        }
    }

    public Node arrayToTree(Integer[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return insertLevelOrder(arr, 0);
    }

    private Node insertLevelOrder(Integer[] arr, int i) {
        if (i < arr.length && arr[i] != null) {
            Node root = new Node(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
            return root;
        }
        return null;
    }

    public List<Integer> inorderRecursive(Node root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderRecursive(root.left, result);
        result.add(root.data);
        inorderRecursive(root.right, result);
    }

    public List<Integer> preorderRecursive(Node root) {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    private void preorderRecursive(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.data);
        preorderRecursive(root.left, result);
        preorderRecursive(root.right, result);
    }

    public List<Integer> postorderRecursive(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    private void postorderRecursive(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorderRecursive(root.left, result);
        postorderRecursive(root.right, result);
        result.add(root.data);
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, null, 2, null, null, 3, 4, null, null, null, null, null, 5 };
        LevelOrderArrayToTree sol = new LevelOrderArrayToTree();
        Node root = sol.arrayToTree(arr);
        System.out.println("Inorder: " + sol.inorderRecursive(root));
        System.out.println("Preorder: " + sol.preorderRecursive(root));
        System.out.println("Postorder: " + sol.postorderRecursive(root));
    }
}