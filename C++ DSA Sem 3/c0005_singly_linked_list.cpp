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
private:
    Node *head;

public:
    List()
    {
        head = NULL;
    }
    void insert_at_end(int d)
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
    void traverse()
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};
int main()
{
    List l;
    for (int i = 0; i < 10; i++)
    {
        l.insert_at_end(i);
    }
    l.traverse();
}