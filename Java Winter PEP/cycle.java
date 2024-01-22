class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class cycle {
    // 1-> 2-> 3-> 4-> 2

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slower = head;
        ListNode faster = head;
        while (slower != null && faster != null) {
            slower = slower.next;
            faster = faster.next;
            if (faster != null)
                faster = faster.next;
            if (slower == faster)
                break;
        }
        if (faster == null) {
            return null;
        }
        slower = head;
        while (slower != faster) {
            slower = slower.next;
            faster = faster.next;

        }
        return slower;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        cycle c = new cycle();
        ListNode nodeWithCycle = c.detectCycle(head);
        System.out.println(nodeWithCycle.val);
    }

}