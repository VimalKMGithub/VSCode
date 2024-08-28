package BinarySearchTree;

public class BuildBst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public void insert2(Node root, int data) {
        if (root.data < data) {
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                insert2(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                insert2(root.left, data);
            }
        }
    }

    public Node insertIterative(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return root;
        }
        Node parent = null, current = root;
        while (current != null) {
            parent = current;
            if (current.data < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        if (parent.data < data) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        return root;
    }

    public void insertIterative2(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node parent = null, current = root;
        while (current != null) {
            parent = current;
            if (current.data < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        if (parent.data < data) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
    }

    public Node search(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (root.data < data) {
            return search(root.right, data);
        }
        return search(root.left, data);
    }

    public Node searchIterative(Node root, int data) {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            if (current.data < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return null;
    }

    public Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data < data) {
            root.right = delete(root.right, data);
        } else if (root.data > data) {
            root.left = delete(root.left, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BuildBst tree = new BuildBst();
        Node root = new Node(50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 70);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);
        tree.inorder(root);
        System.out.println();
        root = tree.delete(root, 70);
        tree.inorder(root);
    }
}