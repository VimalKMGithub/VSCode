public class c0019_middle_node {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(2);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(3);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(4);
        node.setNext(newNode);
        node = newNode;

        c0019_middle_node solution = new c0019_middle_node();
        solution.traverse(head);
        System.out.println("Middle Node: " + solution.middleNode(head).getData());
    }

    private void traverse(c0017_linked_list_node head) {
        c0017_linked_list_node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // find middle node in linked list
    private c0017_linked_list_node middleNode(c0017_linked_list_node head) {
        c0017_linked_list_node slow = head;
        c0017_linked_list_node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
}
