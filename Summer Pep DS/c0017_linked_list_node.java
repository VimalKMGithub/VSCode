public class c0017_linked_list_node {
    private int data;
    private c0017_linked_list_node next;

    c0017_linked_list_node(int data) {
        this.data = data;
    }

    c0017_linked_list_node(int data, c0017_linked_list_node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public c0017_linked_list_node getNext() {
        return next;
    }

    public void setNext(c0017_linked_list_node next) {
        this.next = next;
    }
}