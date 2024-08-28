public class c0022_doubly_linked_list {
    public static void main(String[] args) {
        c0022_doubly_linked_list_node head = null;

        c0022_doubly_linked_list solution = new c0022_doubly_linked_list();
        head = solution.insertAtStart(head, 10);
        head = solution.insertAtStart(head, 20);

        head = solution.insertAtEnd(head, 30);
        head = solution.insertAtEnd(head, 40);

        solution.traverse(head);
        // head = solution.insertAtPosition(head, 50, 4);
        // solution.traverse(head);
        head = solution.reverse(head);
        solution.traverse(head);
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Traverse the doubly linked list
    private void traverse(c0022_doubly_linked_list_node head) {
        c0022_doubly_linked_list_node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    // Insert a new node at the start of the doubly linked list
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
    private c0022_doubly_linked_list_node insertAtEnd(c0022_doubly_linked_list_node head, int data) {
        c0022_doubly_linked_list_node newNode = new c0022_doubly_linked_list_node(data);
        if (head == null) {
            return newNode;
        }
        c0022_doubly_linked_list_node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setPrev(temp);
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // insert at given position
    private c0022_doubly_linked_list_node insertAtPosition(c0022_doubly_linked_list_node head, int data, int position) {
        if (position == 0) {
            return insertAtStart(head, data);
        }
        c0022_doubly_linked_list_node newNode = new c0022_doubly_linked_list_node(data);
        c0022_doubly_linked_list_node temp = head;
        while (position > 1 && temp != null) {
            temp = temp.getNext();
            position--;
        }
        if (temp == null) {
            return head;
        }
        newNode.setNext(temp.getNext());
        newNode.setPrev(temp);
        if (temp.getNext() != null) {
            temp.getNext().setPrev(newNode);
        }
        temp.setNext(newNode);
        return head;
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    // delete at start
    private c0022_doubly_linked_list_node deleteAtStart(c0022_doubly_linked_list_node head) {
        if (head == null) {
            return null;
        }
        head = head.getNext();
        if (head == null) {
            return null;
        }
        head.setPrev(null);
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // delete at end
    private c0022_doubly_linked_list_node deleteAtEnd(c0022_doubly_linked_list_node head) {
        if (head == null) {
            return null;
        }
        c0022_doubly_linked_list_node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        if (temp.getPrev() == null) {
            return null;
        }
        temp.getPrev().setNext(null);
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // delete at position
    private c0022_doubly_linked_list_node deleteAtPosition(c0022_doubly_linked_list_node head, int position) {
        if (position == 0) {
            return deleteAtStart(head);
        }
        c0022_doubly_linked_list_node temp = head;
        while (position > 0 && temp != null) {
            temp = temp.getNext();
            position--;
        }
        if (temp == null) {
            return head;
        }
        if (temp.getNext() == null) {
            temp.getPrev().setNext(null);
            return head;
        }
        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // delete at k
    private c0022_doubly_linked_list_node deleteAtK(c0022_doubly_linked_list_node head, int k) {
        if (head == null) {
            return null;
        }
        c0022_doubly_linked_list_node temp = head;
        while (k > 0 && temp != null) {
            temp = temp.getNext();
            k--;
        }
        if (temp == null) {
            return head;
        }
        if (temp.getPrev() != null) {
            temp.getPrev().setNext(temp.getNext());
        } else {
            head = temp.getNext();
        }
        if (temp.getNext() != null) {
            temp.getNext().setPrev(temp.getPrev());
        }
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // reverse the doubly linked list
    private c0022_doubly_linked_list_node reverseSelf(c0022_doubly_linked_list_node head) {
        c0022_doubly_linked_list_node temp = null;
        c0022_doubly_linked_list_node current = head;
        while (current != null) {
            temp = current.getPrev();
            current.setPrev(current.getNext());
            current.setNext(temp);
            current = current.getPrev();
        }
        if (temp != null) {
            head = temp.getPrev();
        }
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // reverse the doubly linked list
    private c0022_doubly_linked_list_node reverse(c0022_doubly_linked_list_node head) {
        c0022_doubly_linked_list_node temp = head;
        c0022_doubly_linked_list_node newHead = null;
        while (temp != null) {
            if (temp.getNext() == null) {
                newHead = temp;
            }
            c0022_doubly_linked_list_node swapTemp = temp.getNext();
            temp.setNext(temp.getPrev());
            temp.setPrev(swapTemp);
            temp = temp.getPrev();
        }
        return newHead;
    }
}
