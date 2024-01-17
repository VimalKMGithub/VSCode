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
    void insert_at_end(int d);
    void max_value();
};
int main()
{
    List l;
    for (int i = 0; i < 5; i++)
    {
        int n;
        cin >> n;
        l.insert_at_end(n);
    }
    l.max_value();
    return 0;
}
void List::insert_at_end(int d)
{
    Node *n = new Node;
    n->data = d;
    n->next = NULL;
    if (head == NULL)
    {
        head = n;
    }
    else
    {
        Node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = n;
    }
}
void List::max_value()
{
    Node *temp = head;
    int max_val = temp->data;
    while (temp != NULL)
    {
        if (max_val < temp->data)
        {
            max_val = temp->data;
        }
        temp = temp->next;
    }
    cout << max_val;
}