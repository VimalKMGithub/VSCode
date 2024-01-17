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
    int is_palindrome();
};
int reverse(int d)
{
    int reverse = 0, rem;
    while (d != 0)
    {
        rem = d % 10;
        reverse = reverse * 10 + rem;
        d /= 10;
    }
    return reverse;
}
int main()
{
    list l;
    int n;
    cin >> n;
    if (n >= 5 && n <= 15)
    {
        for (int i = 0; i < n; i++)
        {
            int da;
            cin >> da;
            l.insert_at_given_position(i, da);
        }
        int nu = l.is_palindrome();
        if (nu == 1)
        {
            cout << "Yes";
        }
        else
        {
            cout << "No";
        }
    }
    else
    {
        cout << "Invalid Input";
    }
    return 0;
}
void list::insert_at_given_position(int p, int d)
{
    if (p == 0)
    {
        node *n = new node;
        n->data = d;
        n->prev = NULL;
        n->next = head;
        if (head == NULL)
        {
            head = n;
            tail = n;
        }
        else
        {
            head->prev = n;
            head = n;
        }
    }
    else if (p == count)
    {
        node *n = new node;
        n->data = d;
        n->prev = tail;
        n->next = NULL;
        tail->next = n;
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
int list::is_palindrome()
{
    node *temp = head;
    node *temp2 = tail;
    int l = 0;
    while (temp != NULL)
    {
        int k = reverse(temp2->data);
        if (temp->data == k)
        {
            l++;
        }
        temp = temp->next;
        temp2 = temp2->prev;
    }
    if (l == count)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}