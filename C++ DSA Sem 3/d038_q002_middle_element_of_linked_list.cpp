#include <iostream>
using namespace std;
class Node
{
public:
    char data;
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
    void mid(int num);
};
int main()
{
    List l;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        char da;
        cin >> da;
        l.insert_at_end(da);
    }
    if (n == 0)
    {
        return 0;
    }
    else if (n % 2 == 0)
    {
        l.mid((n / 2) - 1);
    }
    else
    {
        l.mid(n / 2);
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
void List::mid(int num)
{
    Node *temp = head;
    for (int i = 0; i < num; i++)
    {
        temp = temp->next;
    }
    cout << temp->data;
}