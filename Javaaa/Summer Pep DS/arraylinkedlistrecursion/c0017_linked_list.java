public class c0017_linked_list {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(1);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(3);
        node.setNext(newNode);
        node = newNode;
        c0017_linked_list_node nodeToDelete = newNode;

        newNode = new c0017_linked_list_node(4);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(5);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(6);
        node.setNext(newNode);
        node = newNode;

        c0017_linked_list solution = new c0017_linked_list();
        solution.traverse(head);

        // System.out.println("Count: " + solution.length(head));

        // head = solution.insertAtBeginning(head, 1);
        // solution.traverse(head);

        // head = solution.insertAtEnd(head, 5);
        // solution.traverse(head);

        // solution.traverse(head);
        // c0017_linked_list_node searchNode = solution.linearSearchInLinkedList(head,
        // 20);
        // if (searchNode != null) {
        // System.out.println("Found: " + searchNode.getData());
        // } else {
        // System.out.println("Not Found");
        // }

        // head = solution.deletNodeAtBeginning(head);
        // solution.traverse(head);

        // head = solution.deletNodeAtEnd(head);
        // solution.traverse(head);

        // solution.traverse(head);
        // head = solution.insertAtPosition(head, 6, 5);

        // solution.traverse(head);
        // head = solution.delete(head, 2);
        // solution.traverse(head);

        // solution.alterbateNodes(head);

        solution.deleteGivenNode(nodeToDelete);
        solution.traverse(head);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // traverse the linked list
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
    // count the number of nodes in the linked list
    private int length(c0017_linked_list_node head) {
        c0017_linked_list_node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // insert a new node at the beginning of the linked list
    private c0017_linked_list_node insertAtBeginning(c0017_linked_list_node head, int data) {
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        newNode.setNext(head);
        return newNode;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // insert a new node at the end of the linked list
    private c0017_linked_list_node insertAtEnd(c0017_linked_list_node head, int data) {
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        if (head == null) {
            return newNode;
        }
        c0017_linked_list_node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        return head;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // insert a new node at a given position in the linked list
    private c0017_linked_list_node insertAtPosition(c0017_linked_list_node head, int data, int position) {
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        if (head == null) {
            return newNode;
        }
        if (position == 0) {
            newNode.setNext(head);
            return newNode;
        }
        c0017_linked_list_node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        if (temp == null) {
            return head;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        return head;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // insert a new node at a given position in the linked list
    private c0017_linked_list_node insert(c0017_linked_list_node head, int data, int position) {
        if (position == 0) {
            return insertAtBeginning(head, data);
        }
        c0017_linked_list_node prev = head;
        c0017_linked_list_node temp = head;
        while (position > 0) {
            prev = temp;
            temp = temp.getNext();
            position--;
        }
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        newNode.setNext(temp);
        prev.setNext(newNode);
        return head;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // search for a node in the linked list
    private c0017_linked_list_node linearSearchInLinkedList(c0017_linked_list_node head, int data) {
        c0017_linked_list_node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // delete the first node of the linked list
    private c0017_linked_list_node deletNodeAtBeginning(c0017_linked_list_node head) {
        if (head == null) {
            return null;
        }
        return head.getNext();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // delete the last node of the linked list
    private c0017_linked_list_node deletNodeAtEnd(c0017_linked_list_node head) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        c0017_linked_list_node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        return head;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // delete a node at a given position in the linked list
    private c0017_linked_list_node delete(c0017_linked_list_node head, int position) {
        if (position == 0) {
            return deletNodeAtBeginning(head);
        }
        c0017_linked_list_node prev = head;
        c0017_linked_list_node temp = head;
        while (position > 0) {
            prev = temp;
            temp = temp.getNext();
            position--;
        }
        prev.setNext(temp.getNext());
        return head;
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

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Given a singly linked list, determine if it is a palindrome.
    private boolean isPalindrome(c0017_linked_list_node head) {
        if (head == null) {
            return true;
        }
        c0017_linked_list_node middle = middleNode(head);
        c0017_linked_list_node middleHeadOriginal = reverse(middle);
        c0017_linked_list_node middleHead = middleHeadOriginal;
        while (head != middle) {
            if (head.getData() != middleHead.getData()) {
                return false;
            }
            middleHead = middleHead.getNext();
            head = head.getNext();
        }
        reverse(middleHeadOriginal);
        return true;
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
        head = reverse(head);
        if (carry == 1) {
            return insertAtBeginning(head, 1);
        }
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

    // Time complexity: O(n)
    // Space complexity: O(1)
    // insert in sorted linked list
    private c0017_linked_list_node insertInSortedLinkedList(c0017_linked_list_node head, int data) {
        c0017_linked_list_node prev = null;
        c0017_linked_list_node temp = head;
        while (temp != null && temp.getData() < data) {
            prev = temp;
            temp = temp.getNext();
        }
        c0017_linked_list_node newNode = new c0017_linked_list_node(data);
        if (prev == null) {
            head = newNode;
        } else {
            prev.setNext(newNode);
        }
        newNode.setNext(temp);
        return head;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // alternate first and last nodes
    private void alterbateNodes(c0017_linked_list_node head) {
        c0017_linked_list_node mid = middleNode(head);
        c0017_linked_list_node t2 = reverse(mid);
        c0017_linked_list_node t1 = head;
        while (t1 != mid && t2.getNext() != t1) {
            c0017_linked_list_node t1Next = t1.getNext();
            t1.setNext(t2);
            t2 = t2.getNext();
            t1 = t1.getNext();
            t1.setNext(t1Next);
            t1 = t1Next;
        }
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    // delete a node in the linked list
    private void deleteGivenNode(c0017_linked_list_node node) {
        c0017_linked_list_node temp = node.getNext();
        node.setData(temp.getData());
        node.setNext(temp.getNext());
    }
}