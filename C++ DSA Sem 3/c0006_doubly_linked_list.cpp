#include <iostream>
using namespace std;
class Node
{
public:
    Node *prev;
    int data;
    Node *next;
};
class List
{
private:
    Node *head, *tail;

public:
    List()
    {
        head = NULL;
        tail = NULL;
    }
    void insert_at_beginning(int d)
    {
        Node *n = new Node;
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
    void deletenode(int p)
    {
        if (head == NULL)
        {
            cout << "Linked List is empty" << endl;
        }
        else
        {
            Node *ptr;
            if (p == 0)
            {
                cout << "Element deleted " << head->data << endl;
                ptr = head;
                head = head->next;
                head->prev = NULL;
                delete (ptr);
            }
            else
            {
                ptr = head;
                while (p > 0)
                {
                    --p;
                    ptr = ptr->next;
                }
                cout << "Element removed" << ptr->data << endl;
                (ptr->prev)->next = ptr->next;
                (ptr->next)->prev = ptr->prev;
                free(ptr);
            }
        }
    }
    void search(int d)
    {
        Node *temp = head;
        while (temp != NULL)
        {
            if (temp->data == d)
            {
                cout << "Element found" << endl;
                break;
            }
            temp = temp->next;
        }

        if (temp == NULL)
        {
            cout << "No element found" << endl;
        }
    }
    void ftraversalList()
    {
        Node *temp = head;
        // ptr=head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }

    void btraversalList()
    {
        Node *temp = tail;
        // ptr=head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->prev;
        }
        cout << endl;
    }
};
int main()
{
    // some functions not work properly
    List l;
    int n, position, item;
    cout << "Enter the number: ";
    for (int i = 0; i < 5; i++)
    {
        cin >> n;
        l.insert_at_beginning(n);
    }
    l.ftraversalList();
    l.btraversalList();
    cout << "Enter the position from where you want to delete element" << endl;
    cin >> position;
    // delete not work for last index
    l.deletenode(position);
    l.ftraversalList();
    cout << "Enter the element which is to be searched" << endl;
    cin >> item;
    l.search(item);
}