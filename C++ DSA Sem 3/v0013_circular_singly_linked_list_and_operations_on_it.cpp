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
    void delete_from_given_position(int pos);
    void traverse();
};
int main()
{
    List l;
    // l.traverse();
    // int pos{}, val{}, num{};
    // cout << "How many elements you want to insert : ";
    // cin >> num;
    // for (int i = 0; i < num; i++)
    // {
    // reenter:
    //     cout << "Enter at what index position you want to insert an element : ";
    //     cin >> pos;
    //     if (pos < 0 || pos > count)
    //     {
    //         cout << "Invalid position Re-Enter" << endl;
    //         goto reenter;
    //     }
    //     cout << "Enter the value of element : ";
    //     cin >> val;
    //     l.insert_at_given_position(val, pos);
    //     l.traverse();
    // }
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_given_position(i, 0);
    }
    l.traverse();
    int position{};
reenter:
    cout << "From what index position you want to delete an element : ";
    cin >> position;
    if (position < 0 || position >= count)
    {
        cout << "Invalid position Re-Enter" << endl;
        goto reenter;
    }
    l.delete_from_given_position(position);
    l.traverse();
    return 0;
}
void List::insert_at_given_position(int d, int pos)
{
    if (pos == 0)
    {
        Node *n = new Node;
        n->data = d;
        if (head == NULL)
        {
            n->next = n;
            head = n;
        }
        else
        {
            Node *temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = n;
            n->next = head;
            head = n;
        }
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
void List::delete_from_given_position(int pos)
{
    if (pos == 0)
    {
        Node *temp = head;
        while (temp->next != head)
        {
            temp = temp->next;
        }
        Node *todelete = head;
        temp->next = head->next;
        head = head->next;
        delete todelete;
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
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        Node *temp = head;
        do
        {
            cout << temp->data << " ";
            temp = temp->next;
        } while (temp != head);
        cout << endl;
    }
}