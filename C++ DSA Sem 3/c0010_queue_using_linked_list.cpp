#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
};
class Queue
{
    Node *front, *rear;

public:
    Queue()
    {
        front = rear = NULL;
    }
    void Enqueue(int elem)
    {
        Node *newnode;
        newnode = new Node;
        newnode->data = elem;
        newnode->next = NULL;
        if (front == NULL)
        {
            front = rear = newnode;
        }
        else
        {
            rear->next = newnode;
            rear = newnode;
        }
    }
    void Dequeue()
    {
        Node *temp;
        if (front == NULL)
            cout << "Queue is Empty" << endl;
        else
        {
            temp = front;
            front = front->next;
            delete temp;
        }
    }
    void show()
    {
        Node *temp;
        temp = front;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};
int main()
{
    Queue q;
    q.Enqueue(10);
    q.Enqueue(20);
    cout << "Queue after inserting the 1st & 2nd values is : ";
    q.show();
    q.Enqueue(4);
    cout << "Queue after inserting the 3rd value is : ";
    q.show();
    q.Dequeue();
    cout << "Queue after deleting a value from the queue: ";
    q.show();
    return 0;
}