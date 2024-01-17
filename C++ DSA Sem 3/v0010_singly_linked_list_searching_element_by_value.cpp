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
    void insert_at_beginning(int d);
    void search_by_value(int d);
    void traverse();
};
int main()
{
    List l;
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_beginning(i);
    }
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        int value{};
        cout << "Enter the value you want to search : ";
        cin >> value;
        l.search_by_value(value);
    }
    return 0;
}
void List::insert_at_beginning(int d)
{
    Node *n = new Node;
    n->data = d;
    n->next = head;
    head = n;
    count++;
}
void List::search_by_value(int d)
{
    Node *temp = head;
    bool flag = false;
    while (temp != NULL)
    {
        if (temp->data == d)
        {
            cout << "Element found" << endl;
            flag = true;
            break;
        }
        temp = temp->next;
    }
    if (flag == false)
    {
        cout << "Element not found" << endl;
    }
}
void List::traverse()
{
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
}