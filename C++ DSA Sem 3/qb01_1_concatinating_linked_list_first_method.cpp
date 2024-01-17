#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
};
void push(Node **head_ref, int new_data)
{
    Node *new_node = new Node();
    new_node->data = new_data;
    new_node->next = NULL;
    if ((*head_ref) == NULL)
    {
        (*head_ref) = new_node;
    }
    else
    {
        Node *temp = (*head_ref);
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = new_node;
    }
}
void printList(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
void merge(Node *p, Node **q)
{
    Node *p_curr = p, *q_curr = *q;
    Node *p_next, *q_next;
    while (p_curr != NULL && q_curr != NULL)
    {
        p_next = p_curr->next;
        q_next = q_curr->next;
        q_curr->next = p_next;
        p_curr->next = q_curr;
        p_curr = p_next;
        q_curr = q_next;
    }
    *q = q_curr;
}
int main()
{
    Node *p = NULL, *q = NULL;
    int da, n1, n2;
    cin >> n1;
    for (int i = 0; i < n1; i++)
    {
        cin >> da;
        push(&p, da);
    }
    cin >> n2;
    for (int i = 0; i < n2; i++)
    {
        cin >> da;
        push(&q, da);
    }
    merge(p, &q);
    printList(p);
    printList(q);
    return 0;
}