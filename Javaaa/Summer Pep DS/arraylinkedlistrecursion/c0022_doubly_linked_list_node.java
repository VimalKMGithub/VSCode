public class c0022_doubly_linked_list_node {
    private c0022_doubly_linked_list_node prev;
    private int data;
    private c0022_doubly_linked_list_node next;

    c0022_doubly_linked_list_node(int data) {
        this.data = data;
    }

    c0022_doubly_linked_list_node(int data, c0022_doubly_linked_list_node next, c0022_doubly_linked_list_node prev) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public c0022_doubly_linked_list_node getNext() {
        return next;
    }

    public void setNext(c0022_doubly_linked_list_node next) {
        this.next = next;
    }

    public c0022_doubly_linked_list_node getPrev() {
        return prev;
    }

    public void setPrev(c0022_doubly_linked_list_node prev) {
        this.prev = prev;
    }
}
