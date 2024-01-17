#include <iostream>
using namespace std;
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
    void insert_at_beginning(int d);
    void traverse();
};
int main()
{
    List l;
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_beginning(i);
    }
    l.traverse();
    return 0;
}
void List::insert_at_beginning(int d)
{
    Node *n = new Node;
    n->data = d;
    n->next = head;
    head = n;
}
void List::traverse()
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}