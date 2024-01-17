#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;
};
class Stack
{
    node *front;

public:
    Stack()
    {
        front = NULL;
    }

    void push(int d)
    {
        node *temp;
        temp = new node();

        temp->data = d;

        if (front == NULL)
        {
            temp->next = NULL;
        }
        else
        {
            temp->next = front;
        }
        front = temp;
    }
    void pop()
    {
        // if empty
        if (front == NULL)
            cout << "UNDERFLOW\n";

        // delete the first element
        else
        {
            cout << "element removed " << front->data << endl;
            node *temp = front;
            front = front->next;
            delete (temp);
        }
    }
    void top()
    {
        cout << "Top element is " << front->data;
    }
};
int main()
{
    Stack s;
    int n;
    cout << "Enter the elements" << endl;
    for (int i = 0; i < 5; i++)
    {
        cin >> n;
        s.push(n);
    }
    s.pop();
    s.top();
}