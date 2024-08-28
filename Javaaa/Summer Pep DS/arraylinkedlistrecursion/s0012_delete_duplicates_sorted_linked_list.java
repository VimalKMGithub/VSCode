public class s0012_delete_duplicates_sorted_linked_list {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(2);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        s0012_delete_duplicates_sorted_linked_list solution = new s0012_delete_duplicates_sorted_linked_list();
        solution.traverse(head);
        head = solution.deleteDuplicates(head);
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

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // delete duplicates in sorted linked list
    private c0017_linked_list_node deleteDuplicates(c0017_linked_list_node head) {
        c0017_linked_list_node temp = head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getData() == temp.getNext().getData()) {
                temp.setNext(temp.getNext().getNext());
            } else {
                temp = temp.getNext();
            }
        }
        return head;
    }
}
