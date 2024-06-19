public class s0011_insert_delete_in_sorted_linked_list {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(2);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(4);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(6);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(8);
        node.setNext(newNode);
        node = newNode;

        s0011_insert_delete_in_sorted_linked_list solution = new s0011_insert_delete_in_sorted_linked_list();
        solution.traverse(head);
        // head = solution.insertInSortedLinkedList(head, 9);
        // solution.traverse(head);

        head = solution.deleteInSortedLinkedList(head, 10);
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
    // insert in sorted linked list
    private c0017_linked_list_node insertInSortedLinkedList(c0017_linked_list_node head, int data) {
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        c0017_linked_list_node temp = head;
        c0017_linked_list_node prev = null;
        while (temp != null && temp.getData() < data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (prev == null) {
            newNode.setNext(head);
            return newNode;
        }
        prev.setNext(newNode);
        newNode.setNext(temp);
        return head;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // delete in sorted linked list
    private c0017_linked_list_node deleteInSortedLinkedList(c0017_linked_list_node head, int data) {
        c0017_linked_list_node temp = head;
        c0017_linked_list_node prev = null;
        while (temp != null && temp.getData() != data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            return head;
        }
        if (prev == null) {
            return head.getNext();
        }
        prev.setNext(temp.getNext());
        return head;
    }
}
