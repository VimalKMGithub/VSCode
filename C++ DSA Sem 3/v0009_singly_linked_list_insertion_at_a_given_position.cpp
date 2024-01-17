#include <iostream>
using namespace std;
unsigned int count{0};
class Node
{
public:
    int data;
    Node *next;
};
class List
{
    Node *head;

public:
    List()
    {
        head = NULL;
    }
    void insert_at_given_position(int d, int pos);
    void traverse();
};
int main()
{
    List l;
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_given_position(i, i);
    }
    l.traverse();
    int position{};
    int value{};
reenter:
    cout << "At what index position you want to insert an element : ";
    cin >> position;
    if (position < 0 || position > count)
    {
        cout << "Invalid position Re-Enter" << endl;
        goto reenter;
    }
    cout << "Enter value : ";
    cin >> value;
    l.insert_at_given_position(value, position);
    l.traverse();
    return 0;
}
void List::insert_at_given_position(int d, int pos)
{
    if (pos == 0)
    {
        Node *n = new Node;
        n->data = d;
        n->next = head;
        head = n;
    }
    else
    {
        Node *n = new Node;
        n->data = d;
        Node *temp = head;
        for (int i = 0; i < pos - 1; i++)
        {
            temp = temp->next;
        }
        n->next = temp->next;
        temp->next = n;
    }
    count++;
}
void List::traverse()
{
    Node *temp = head;
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
}