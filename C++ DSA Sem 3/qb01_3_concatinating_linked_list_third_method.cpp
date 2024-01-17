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
    Node *headd;

public:
    List()
    {
        head = NULL;
        headd = NULL;
    }
    void insert_at_end(int d);
    void insert_at_end_s(int d);
    void traverse();
};
int main()
{
    List l;
    int first, data, second;
    cin >> first;

    for (int i = 0; i < first; i++)
    {
        cin >> data;
        l.insert_at_end(data);
    }
    cin >> second;
    for (int i = 0; i < second; i++)
    {
        cin >> data;
        l.insert_at_end_s(data);
    }
    l.traverse();
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
void List::insert_at_end_s(int d)
{
    Node *nn = new Node;
    nn->data = d;
    nn->next = NULL;
    if (headd == NULL)
    {
        headd = nn;
    }
    else
    {
        Node *temp = headd;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = nn;
    }
}
void List::traverse()
{
    Node *temp = head;
    Node *tempp = headd;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
        if (tempp != NULL)
        {
            cout << tempp->data << " ";
            tempp = tempp->next;
        }
    }
    cout << endl;
    while (tempp != NULL)
    {
        cout << tempp->data << " ";
        tempp = tempp->next;
    }
    cout << endl;
}