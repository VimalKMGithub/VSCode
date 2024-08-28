public class s0013_delete_all_occurence_linked_list {
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

        newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        s0013_delete_all_occurence_linked_list solution = new s0013_delete_all_occurence_linked_list();
        solution.traverse(head);

        head = solution.deleteAllOccurenceInLinkedList(head, 2);
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
    // delete all occurence in linked list
    private c0017_linked_list_node deleteAllOccurenceInLinkedList(c0017_linked_list_node head, int data) {
        c0017_linked_list_node temp = head;
        c0017_linked_list_node prev = null;
        while (temp != null) {
            if (temp.getData() == data) {
                if (prev == null) {
                    head = temp.getNext();
                } else {
                    prev.setNext(temp.getNext());
                }
            } else {
                prev = temp;
            }
            temp = temp.getNext();
        }
        return head;
    }
}
