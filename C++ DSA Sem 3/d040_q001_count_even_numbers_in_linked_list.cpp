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
    int even_count();
};
int main()
{
    List l;
    int n;
    do
    {
        cin >> n;
        l.insert_at_end(n);
    } while (n != -1);
    int k = l.even_count();
    if (k == 0)
    {
        cout << "No even number present";
    }
    else
    {
        cout << k;
    }
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
int List::even_count()
{
    int num = 0;
    Node *temp = head;
    while (temp != NULL)
    {
        if (temp->data % 2 == 0)
        {
            num++;
        }
        temp = temp->next;
    }
    if (num == 0)
    {
        return 0;
    }
    else
    {
        return num;
    }
}