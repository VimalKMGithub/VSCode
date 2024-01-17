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
    void push(int d);
    void pop();
    void peek();
};
int main()
{
    Stack s;
    int ch, item;
    cout << "1. to push" << endl;
    cout << "2. to pop" << endl;
    cout << "3. to peek" << endl;
    cout << "4. exit" << endl;
    do
    {
        cout << "Enter your choice : ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "Enter value you want to push : ";
            cin >> item;
            s.push(item);
            break;
        case 2:
            s.pop();
            break;
        case 3:
            s.peek();
            break;
        case 4:
            break;
        default:
            cout << "Invalid choice" << endl;
            break;
        }
    } while (ch != 4);
    return 0;
}
void Stack::push(int d)
{
    node *n = new node();
    n->data = d;
    if (front == NULL)
    {
        n->next = NULL;
    }
    else
    {
        n->next = front;
    }
    front = n;
}
void Stack::pop()
{
    if (front == NULL)
    {
        cout << "Underflow" << endl;
    }
    else
    {
        cout << "Element removed " << front->data << endl;
        node *temp = front;
        front = front->next;
        delete (temp);
    }
}
void Stack::peek()
{
    node *temp = front;
    if (temp == NULL)
    {
        cout << "Stack is empty" << endl;
    }
    else
    {
        cout << "Stack : " << endl;
        while (temp != NULL)
        {
            cout << temp->data << endl;
            temp = temp->next;
        }
    }
}