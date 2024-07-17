package stack;

public interface Stack {
    void push(Integer newVal);

    Integer poll();

    Integer top();

    int size();

    boolean isEmpty();

    void print();
}
