public class n0009_add_one_in_singly_linked_list {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(9);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(9);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(9);
        node.setNext(newNode);
        node = newNode;

        n0009_add_one_in_singly_linked_list solution = new n0009_add_one_in_singly_linked_list();
        solution.traverse(head);
        head = solution.addOne2(head);
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

    private c0017_linked_list_node insertAtBeginning(c0017_linked_list_node head, int data) {
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        newNode.setNext(head);
        return newNode;
    }

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

    // Time complexity: O(n)
    // Space complexity: O(1)
    // add one to the linked list
    private c0017_linked_list_node addOne(c0017_linked_list_node head) {
        head = reverse(head);
        c0017_linked_list_node temp = head;
        int carry = 1;
        while (carry != 0 & temp != null) {
            int sum = temp.getData() + carry;
            temp.setData(sum % 10);
            carry = sum / 10;
            temp = temp.getNext();
        }
        if (carry == 1) {
            return insertAtBeginning(head, 1);
        }
        head = reverse(head);
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // add one to the linked list
    private c0017_linked_list_node addOne2(c0017_linked_list_node head) {
        c0017_linked_list_node temp = head;
        c0017_linked_list_node prev = null;
        int carry = 1;
        while (carry != 0 & temp != null) {
            int sum = temp.getData() + carry;
            temp.setData(sum % 10);
            carry = sum / 10;
            prev = temp;
            temp = temp.getNext();
        }
        if (carry == 1) {
            temp = new c0017_linked_list_node(1);
            prev.setNext(temp);
        }
        return head;
    }
}
