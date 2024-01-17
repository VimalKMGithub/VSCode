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
            cout << "Element deleted from queue is : " << temp->data << endl;
            delete temp;
        }
    }
    void show()
    {
        if (front == NULL)
            cout << "Queue is Empty" << endl;
        else
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
    }
};
int main()
{
    Queue q;
    int ch;
    cout << "1) Insert element to queue" << endl;
    cout << "2) Delete element from queue" << endl;
    cout << "3) Display all the elements of queue" << endl;
    cout << "4) Exit" << endl;
    do
    {
        cout << "Enter your choice : " << endl;
        cin >> ch;
        switch (ch)
        {
        case 1:
            int val;
            cout << "Insert the element in queue : " << endl;
            cin >> val;
            q.Enqueue(val);
            break;
        case 2:
            q.Dequeue();
            break;
        case 3:
            q.show();
            break;
        case 4:
            cout << "Exit" << endl;
            break;
        default:
            cout << "Invalid choice" << endl;
        }
    } while (ch != 4);
    return 0;
}