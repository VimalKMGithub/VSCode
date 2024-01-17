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
private:
    Node *head;

public:
    List()
    {
        head = NULL;
    }
    void insert_at_beginning(int d);
    void delete_at_given_position(int pos);
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
    int position{};
    cout << "From what index position you want to delete an element : ";
    cin >> position;
    if (position < 0 || position >= count)
    {
        cout << "Invalid position" << endl;
        return 0;
    }
    l.delete_at_given_position(position);
    l.traverse();
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
void List::delete_at_given_position(int pos)
{
    if (pos == 0)
    {
        Node *temp = head;
        head = head->next;
        delete temp;
    }
    else
    {
        Node *temp = head;
        for (int i = 0; i < pos - 1; i++)
        {
            temp = temp->next;
        }
        Node *todelete = temp->next;
        temp->next = temp->next->next;
        delete todelete;
    }
    count--;
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