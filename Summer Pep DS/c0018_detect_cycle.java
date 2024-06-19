public class c0018_detect_cycle {
    public static void main(String[] args) {
        c0017_linked_list_node head = null;
        c0017_linked_list_node node = new c0017_linked_list_node(2);
        head = node;
        node.setNext(head);

        c0017_linked_list_node newNode = new c0017_linked_list_node(3);
        node.setNext(newNode);
        node = newNode;

        newNode = new c0017_linked_list_node(4);
        node.setNext(newNode);
        node = newNode;
        newNode.setNext(head);

        c0018_detect_cycle solution = new c0018_detect_cycle();
        System.out.println(solution.detectCycleStart(head).getData());
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // detect cycle in linked list
    private boolean hasCycle(c0017_linked_list_node head) {
        c0017_linked_list_node slow = head;
        c0017_linked_list_node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // detect cycle start in linked list
    private c0017_linked_list_node detectCycleStart(c0017_linked_list_node head) {
        c0017_linked_list_node slow = head;
        c0017_linked_list_node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.getNext() == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }
}
