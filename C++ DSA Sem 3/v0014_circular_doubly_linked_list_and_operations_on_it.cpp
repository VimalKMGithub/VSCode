#include <iostream>
using namespace std;
unsigned int count{0};
class node
{
public:
    node *prev;
    int data;
    node *next;
};
class list
{
    node *head, *tail;

public:
    list()
    {
        head = NULL;
        tail = NULL;
    }
    void insert_at_given_position(int p, int d);
    void delete_from_given_position(int p);
    void forward_traverse();
    void backward_traverse();
};
int main()
{
    list l;
    // int pos, value, num;
    // l.forward_traverse();
    // cout << "How many elements you want to insert : ";
    // cin >> num;
    // for (int i = 0; i < num; i++)
    // {
    // reenter:
    //     cout << "Enter at what index position you want to insert an element : ";
    //     cin >> pos;
    //     if (pos < 0 || pos > count)
    //     {
    //         cout << "Invalid Position Re-Enter" << endl;
    //         goto reenter;
    //     }
    //     cout << "Enter the value of element : ";
    //     cin >> value;
    //     l.insert_at_given_position(pos, value);
    //     l.forward_traverse();
    // }
    // l.backward_traverse();
    int pos;
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_given_position(0, i);
    }
    l.forward_traverse();
reenter:
    cout << "From what index position from you want to delete element : ";
    cin >> pos;
    if (pos < 0 || pos >= count)
    {
        cout << "Invalid Position Re-Enter" << endl;
        goto reenter;
    }
    l.delete_from_given_position(pos);
    l.forward_traverse();
    l.backward_traverse();
    return 0;
}
void list::insert_at_given_position(int p, int d)
{
    if (p == 0)
    {
        node *n = new node;
        n->data = d;
        if (head == NULL)
        {
            n->next = n;
            n->prev = n;
            head = n;
            tail = n;
        }
        else
        {
            node *temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = n;
            n->prev = temp;
            n->next = head;
            head->prev = n;
            head = n;
        }
    }
    else if (p == count)
    {
        node *n = new node;
        n->data = d;
        n->prev = tail;
        n->next = head;
        tail->next = n;
        head->prev = n;
        tail = n;
    }
    else
    {
        node *n = new node;
        n->data = d;
        node *temp = head;
        for (int i = 0; i < p - 1; i++)
        {
            temp = temp->next;
        }
        n->next = temp->next;
        n->prev = temp;
        (temp->next)->prev = n;
        temp->next = n;
    }
    count++;
}
void list::delete_from_given_position(int p)
{
    if (p == 0)
    {
        node *ptr = head;
        head = head->next;
        head->prev = tail;
        tail->next = head;
        delete (ptr);
    }
    else if (p == (count - 1))
    {
        node *ptr = tail;
        tail = tail->prev;
        tail->next = head;
        head->prev = tail;
        delete (ptr);
    }
    else
    {
        node *ptr = head;
        for (int i = 0; i < p; i++)
        {
            ptr = ptr->next;
        }
        (ptr->prev)->next = ptr->next;
        (ptr->next)->prev = ptr->prev;
        delete (ptr);
    }
    count--;
}
void list::forward_traverse()
{
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        node *temp = head;
        cout << "Forward traversing : ";
        do
        {
            cout << temp->data << " ";
            temp = temp->next;
        } while (temp != head);
        cout << endl;
    }
}
void list::backward_traverse()
{
    if (count == 0)
    {
        cout << "List is empty" << endl;
    }
    else
    {
        node *temp = tail;
        cout << "Backward traversing : ";
        do
        {
            cout << temp->data << " ";
            temp = temp->prev;
        } while (temp != tail);
        cout << endl;
    }
}