package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeUsingArray {
    List<Integer> preorder(Integer[] treeArray) {
        List<Integer> result = new ArrayList<>();
        preorder(treeArray, 0, result);
        return result;
    }

    void preorder(Integer[] treeArray, int index, List<Integer> result) {
        if (index >= treeArray.length || treeArray[index] == null) {
            return;
        }
        result.add(treeArray[index]);
        preorder(treeArray, left(index), result);
        preorder(treeArray, right(index), result);
    }

    List<Integer> postorder(Integer[] treeArray) {
        List<Integer> result = new ArrayList<>();
        postorder(treeArray, 0, result);
        return result;
    }

    void postorder(Integer[] treeArray, int index, List<Integer> result) {
        if (index >= treeArray.length || treeArray[index] == null) {
            return;
        }
        postorder(treeArray, left(index), result);
        postorder(treeArray, right(index), result);
        result.add(treeArray[index]);
    }

    List<Integer> inorder(Integer[] treeArray) {
        List<Integer> result = new ArrayList<>();
        inorder(treeArray, 0, result);
        return result;
    }

    void inorder(Integer[] treeArray, int index, List<Integer> result) {
        if (index >= treeArray.length || treeArray[index] == null) {
            return;
        }
        inorder(treeArray, left(index), result);
        result.add(treeArray[index]);
        inorder(treeArray, right(index), result);
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, null, 2, null, null, 3, 4, null, null, null, null, null, 5 };
        TreeUsingArray sol = new TreeUsingArray();
        System.out.println("Inorder: " + sol.inorder(arr));
        System.out.println("Preorder: " + sol.preorder(arr));
        System.out.println("Postorder: " + sol.postorder(arr));
    }
}