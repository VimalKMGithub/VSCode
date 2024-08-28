package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversals {
    public List<Integer> preorderRecursive(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    private void preorderRecursive(BinaryTreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.data);
        preorderRecursive(root.left, result);
        preorderRecursive(root.right, result);
    }

    public List<Integer> preorder(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode top = stack.pop();
            result.add(top.data);
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
        return result;
    }

    public List<Integer> postorderRecursive(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    private void postorderRecursive(BinaryTreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorderRecursive(root.left, result);
        postorderRecursive(root.right, result);
        result.add(root.data);
    }

    static class TraversalStackNode {
        BinaryTreeNode node;
        boolean isAllPreprocessingDone;

        public TraversalStackNode(BinaryTreeNode node) {
            this.node = node;
        }
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public List<Integer> postorder(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TraversalStackNode> stack = new Stack<>();
        stack.push(new TraversalStackNode(root));
        while (!stack.isEmpty()) {
            TraversalStackNode top = stack.peek();
            if (top.isAllPreprocessingDone || (top.node.left == null && top.node.right == null)) {
                result.add(top.node.data);
                stack.pop();
                continue;
            }
            top.isAllPreprocessingDone = true;
            if (top.node.right != null) {
                stack.push(new TraversalStackNode(top.node.right));
            }
            if (top.node.left != null) {
                stack.push(new TraversalStackNode(top.node.left));
            }
        }
        return result;
    }

    public List<Integer> inorderRecursive(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(BinaryTreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderRecursive(root.left, result);
        result.add(root.data);
        inorderRecursive(root.right, result);
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public List<Integer> inorder(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TraversalStackNode> stack = new Stack<>();
        stack.push(new TraversalStackNode(root));
        while (!stack.isEmpty()) {
            TraversalStackNode top = stack.peek();
            if (top.isAllPreprocessingDone || top.node.left == null) {
                result.add(top.node.data);
                stack.pop();
                if (top.node.right != null) {
                    stack.push(new TraversalStackNode(top.node.right));
                }
                continue;
            }
            top.isAllPreprocessingDone = true;
            stack.push(new TraversalStackNode(top.node.left));
        }
        return result;
    }

    public BinaryTreeNode inorderPredecessor(BinaryTreeNode root, BinaryTreeNode nodeForFindingPredecessor) {
        if (root == null || nodeForFindingPredecessor == null) {
            return null;
        }
        Stack<TraversalStackNode> stack = new Stack<>();
        stack.push(new TraversalStackNode(root));
        BinaryTreeNode cur = null;
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            TraversalStackNode top = stack.peek();
            if (top.isAllPreprocessingDone || top.node.left == null) {
                prev = cur;
                cur = top.node;
                if (cur == nodeForFindingPredecessor) {
                    return prev;
                }
                stack.pop();
                if (top.node.right != null) {
                    stack.push(new TraversalStackNode(top.node.right));
                }
                continue;
            }
            top.isAllPreprocessingDone = true;
            stack.push(new TraversalStackNode(top.node.left));
        }
        return null;
    }

    static class PredecessorAns {
        BinaryTreeNode prev;
        BinaryTreeNode predecessorAns;

        public PredecessorAns(BinaryTreeNode prev, BinaryTreeNode predecessorAns) {
            this.prev = prev;
            this.predecessorAns = predecessorAns;
        }
    }

    // public PredecessorAns inorderPredecessor(BinaryTreeNode root, BinaryTreeNode
    // nodeForFindingPredecessor,
    // BinaryTreeNode prev) {
    // if (root == null || nodeForFindingPredecessor == null) {
    // return null;
    // }
    // PredecessorAns ans = null;
    // if (root.left != null) {
    // ans = inorderPredecessor(root.left, nodeForFindingPredecessor, prev);
    // if (ans.predecessorAns != null) {
    // return ans;
    // }
    // }
    // if (root == nodeForFindingPredecessor) {
    // return new PredecessorAns(null, ans == null ? null : ans.prev);
    // }
    // if (root.left == null && root.right == null) {
    // return new PredecessorAns(root, null);
    // }
    // if (root.right != null) {
    // ans = inorderPredecessor(root.right, nodeForFindingPredecessor, root);
    // }
    // return ans;
    // }

    public BinaryTreeNode inorderSuccessor(BinaryTreeNode root, BinaryTreeNode nodeForFindingPredecessor) {
        if (root == null || nodeForFindingPredecessor == null) {
            return null;
        }
        Stack<TraversalStackNode> stack = new Stack<>();
        stack.push(new TraversalStackNode(root));
        BinaryTreeNode cur = null;
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            TraversalStackNode top = stack.peek();
            if (top.isAllPreprocessingDone || top.node.left == null) {
                prev = cur;
                cur = top.node;
                if (prev == nodeForFindingPredecessor) {
                    return cur;
                }
                stack.pop();
                if (top.node.right != null) {
                    stack.push(new TraversalStackNode(top.node.right));
                }
                continue;
            }
            top.isAllPreprocessingDone = true;
            stack.push(new TraversalStackNode(top.node.left));
        }
        return null;
    }

    public List<Integer> levelOrder(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode firstNode = queue.poll();
            result.add(firstNode.data);
            if (firstNode.left != null) {
                queue.add(firstNode.left);
            }
            if (firstNode.right != null) {
                queue.add(firstNode.right);
            }
        }
        return result;
    }

    public List<List<Integer>> levelOrderAnswerForEachLevel(BinaryTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelAns = new ArrayList<>();
            while (levelSize > 0) {
                BinaryTreeNode firstNode = queue.poll();
                levelAns.add(firstNode.data);
                if (firstNode.left != null) {
                    queue.add(firstNode.left);
                }
                if (firstNode.right != null) {
                    queue.add(firstNode.right);
                }
                levelSize--;
            }
            result.add(levelAns);
        }
        return result;
    }

    public List<List<Integer>> zigZagTraversal(BinaryTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelAns = new ArrayList<>();
            while (levelSize > 0) {
                BinaryTreeNode firstNode = queue.poll();
                levelAns.add(firstNode.data);
                if (firstNode.left != null) {
                    queue.add(firstNode.left);
                }
                if (firstNode.right != null) {
                    queue.add(firstNode.right);
                }
                levelSize--;
            }
            if (level % 2 == 1) {
                Collections.reverse(levelAns);
                // levelAns = reverse(levelAns);
            }
            result.add(levelAns);
            level++;
        }
        return result;
    }

    private List<Integer> reverse(List<Integer> list) {
        // List<Integer> reversedList = new ArrayList<>();
        // for (int i = list.size() - 1; i >= 0; i--) {
        // reversedList.add(list.get(i));
        // }
        // return reversedList;

        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        return list;
    }

    public int countNodes(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int maxDepthBasedOnNumberOfVertices(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepthLeft = maxDepthBasedOnNumberOfVertices(root.left);
        int maxDepthRight = maxDepthBasedOnNumberOfVertices(root.right);
        return 1 + Math.max(maxDepthLeft, maxDepthRight);
    }

    public static void main(String[] args) {
        BinaryTreeNode two = new BinaryTreeNode(2);
        BinaryTreeNode sixteen = new BinaryTreeNode(16);
        BinaryTreeNode twelve = new BinaryTreeNode(12);
        BinaryTreeNode thirteen = new BinaryTreeNode(13);
        BinaryTreeNode fifteen = new BinaryTreeNode(15);

        BinaryTreeNode nine = new BinaryTreeNode(9, two, sixteen);
        BinaryTreeNode minusOne = new BinaryTreeNode(-1, null, twelve);
        BinaryTreeNode nineteen = new BinaryTreeNode(19, null, fifteen);

        BinaryTreeNode three = new BinaryTreeNode(3, nine, minusOne);
        BinaryTreeNode four = new BinaryTreeNode(4, thirteen, nineteen);

        BinaryTreeNode root = new BinaryTreeNode(1, three, four);

        BinaryTreeTraversals traversals = new BinaryTreeTraversals();

        System.out.println(traversals.inorder(root));

        // BinaryTreeNode ans = traversals.inorderPredecessor(root, two);
        // if (ans != null) {
        // System.out.println(ans.data);
        // } else {
        // System.out.println("null");
        // }

        BinaryTreeNode ans = traversals.inorderSuccessor(root, fifteen);
        if (ans != null) {
            System.out.println(ans.data);
        } else {
            System.out.println("null");
        }
    }
}