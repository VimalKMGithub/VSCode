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
    void count();
};
int main()
{
    List l;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int da;
        cin >> da;
        l.insert_at_end(da);
    }
    l.count();
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
void List::count()
{
    Node *temp = head;
    int k = 0;
    while (temp != NULL)
    {
        if (temp->data > 18)
        {
            k++;
        }
        temp = temp->next;
    }
    cout << k;
}