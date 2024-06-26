public class s0015_insert_delete_doubly_linked_list {
    public static void main(String[] args) {
        c0022_doubly_linked_list_node head = null;

        s0015_insert_delete_doubly_linked_list solution = new s0015_insert_delete_doubly_linked_list();
        // head = solution.insertAtStart(head, 50);
        // head = solution.insertAtStart(head, 40);
        // head = solution.insertAtStart(head, 30);
        // head = solution.insertAtStart(head, 20);

        solution.traverse(head);
        head = solution.insertInSorted(head, 55);
        solution.traverse(head);
        head = solution.insertInSorted(head, 60);
        solution.traverse(head);
        head = solution.insertInSorted(head, 58);
        solution.traverse(head);

    }

    private void traverse(c0022_doubly_linked_list_node head) {
        c0022_doubly_linked_list_node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    private c0022_doubly_linked_list_node insertAtStart(c0022_doubly_linked_list_node head, int data) {
        c0022_doubly_linked_list_node newNode = new c0022_doubly_linked_list_node(data);
        newNode.setNext(head);
        if (head != null) {
            head.setPrev(newNode);
        }
        return newNode;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Insert a new node at the end of the doubly linked list
    private c0022_doubly_linked_list_node insertInSorted(c0022_doubly_linked_list_node head, int data) {
        c0022_doubly_linked_list_node newNode = new c0022_doubly_linked_list_node(data);
        c0022_doubly_linked_list_node temp = head;
        c0022_doubly_linked_list_node prev = null;
        if (temp == null) {
            return newNode;
        }
        while (temp != null && temp.getData() < data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (prev == null) {
            newNode.setNext(head);
            head.setPrev(newNode);
            return newNode;
        }
        prev.setNext(newNode);
        newNode.setPrev(prev);
        newNode.setNext(temp);
        if (temp != null) {
            temp.setPrev(newNode);
        }
        return head;
    }
}
