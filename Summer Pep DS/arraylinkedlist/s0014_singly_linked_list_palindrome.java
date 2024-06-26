public class s0014_singly_linked_list_palindrome {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;

        c0017_linked_list_node node = new c0017_linked_list_node(2);
        head = node;

        c0017_linked_list_node newNode = new c0017_linked_list_node(3);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(3);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(2);
        node.setNext(newNode);
        node = newNode;

        s0014_singly_linked_list_palindrome solution = new s0014_singly_linked_list_palindrome();
        System.out.println(solution.isPalindrome(head));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Given a singly linked list, determine if it is a palindrome.
    private boolean isPalindrome(c0017_linked_list_node head) {
        c0017_linked_list_node slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (slow.getData() != fast.getData()) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return true;
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
}
