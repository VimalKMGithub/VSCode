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
    void traverse();
    void sort();
};
int main()
{
    List l;
    int num, value;
    cout << "Enter number of elements : ";
    cin >> num;
    for (int i = 0; i < num; i++)
    {
        cout << "Enter " << i + 1 << " value : ";
        cin >> value;
        l.insert_at_end(value);
    }
    cout << "Before sort : ";
    l.traverse();
    l.sort();
    cout << "After sort : ";
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
void List::sort()
{
    Node *temp = head;
    while (temp->next != NULL)
    {
        Node *temp0 = head;
        while (temp0->next != NULL)
        {
            int dat = temp0->data;
            int dat0 = temp0->next->data;
            if (dat > dat0)
            {
                temp0->data = dat0;
                temp0->next->data = dat;
            }
            temp0 = temp0->next;
        }
        temp = temp->next;
    }
}