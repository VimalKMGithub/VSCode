public class c0021_reverse_linked_list {
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

        newNode = new c0017_linked_list_node(5);
        node.setNext(newNode);
        node = newNode;

        c0021_reverse_linked_list solution = new c0021_reverse_linked_list();
        solution.traverse(head);

        head = solution.reverse(head);
        solution.traverse(head);
    }

    private void traverse(c0017_linked_list_node head) {
        c0017_linked_list_node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Reverse the linked list
    private c0017_linked_list_node reverse(c0017_linked_list_node head) {
        c0017_linked_list_node prev = null;
        c0017_linked_list_node current = head;
        c0017_linked_list_node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }
}
