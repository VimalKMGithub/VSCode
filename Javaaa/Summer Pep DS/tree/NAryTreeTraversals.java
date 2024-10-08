package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NAryTreeTraversals {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> preorderRecursive(NAryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    private void preorderRecursive(NAryTreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.data);
        for (NAryTreeNode child : root.children) {
            preorderRecursive(child, result);
        }
    }

    public List<Integer> preorder(NAryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<NAryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            NAryTreeNode top = stack.pop();
            result.add(top.data);
            for (int i = top.children.size() - 1; i >= 0; i--) {
                stack.push(top.children.get(i));
            }

            // Collections.reverse(top.children);
            // for (NAryTreeNode child : top.children) {
            // stack.push(child);
            // }
        }
        return result;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> postorderRecursive(NAryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    private void postorderRecursive(NAryTreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        for (NAryTreeNode child : root.children) {
            postorderRecursive(child, result);
        }
        result.add(root.data);
    }

    static class TraversalStackNode {
        NAryTreeNode node;
        boolean areAllChildrenExplored;

        public TraversalStackNode(NAryTreeNode node) {
            this.node = node;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> postorder(NAryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TraversalStackNode> stack = new Stack<>();
        stack.push(new TraversalStackNode(root));
        while (!stack.isEmpty()) {
            TraversalStackNode top = stack.peek();
            if (top.areAllChildrenExplored || top.node.children.isEmpty()) {
                result.add(top.node.data);
                stack.pop();
                continue;
            }
            top.areAllChildrenExplored = true;
            for (int i = top.node.children.size() - 1; i >= 0; i--) {
                stack.push(new TraversalStackNode(top.node.children.get(i)));
            }
        }
        return result;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> levelOrderTraversal(NAryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<NAryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NAryTreeNode front = queue.poll();
            result.add(front.data);
            for (NAryTreeNode child : front.children) {
                queue.add(child);
            }
        }
        return result;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private boolean dfs(NAryTreeNode root, int valToSearch) {
        if (root == null) {
            return false;
        }
        if (root.data == valToSearch) {
            return true;
        }
        for (NAryTreeNode child : root.children) {
            boolean result = dfs(child, valToSearch);
            if (result) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean bfs(NAryTreeNode root, int valToSearch) {
        if (root == null) {
            return false;
        }
        Queue<NAryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NAryTreeNode front = queue.poll();
            if (front.data == valToSearch) {
                return true;
            }
            for (NAryTreeNode child : front.children) {
                queue.add(child);
            }
        }
        return false;
    }

    public int countNodes(NAryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (NAryTreeNode child : root.children) {
            count += countNodes(child);
        }
        return count;
    }

    public static void main(String[] args) {
        NAryTreeNode five = new NAryTreeNode(5);
        NAryTreeNode six = new NAryTreeNode(6);
        NAryTreeNode seven = new NAryTreeNode(7);
        NAryTreeNode eight = new NAryTreeNode(8);
        NAryTreeNode nine = new NAryTreeNode(9);
        NAryTreeNode ten = new NAryTreeNode(10);

        NAryTreeNode two = new NAryTreeNode(2, Arrays.asList(five, six));
        NAryTreeNode three = new NAryTreeNode(3, Arrays.asList(seven));
        NAryTreeNode four = new NAryTreeNode(4, Arrays.asList(eight, nine, ten));
        NAryTreeNode root = new NAryTreeNode(1, Arrays.asList(two, three, four));

        NAryTreeTraversals traversals = new NAryTreeTraversals();
        // System.out.println(NAryTreeTraversals.preorderRecursive(root));
        // System.out.println(NAryTreeTraversals.postorderRecursive(root));
        // System.out.println(traversals.levelOrderTraversal(root));
        System.out.println(traversals.postorderRecursive(root));
        System.out.println(traversals.postorder(root));
    }
}