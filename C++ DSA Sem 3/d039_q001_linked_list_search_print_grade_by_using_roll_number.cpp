#include <iostream>
using namespace std;
unsigned int count{0};
class Node
{
public:
    int data;
    char grade;
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
    void insert_at_beginning(int d, char c);
    void search_by_value(int d);
};
int main()
{
    List l;
    int n, s;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int da;
        char ca;
        cin >> da >> ca;
        l.insert_at_beginning(da, ca);
    }
    cin >> s;
    l.search_by_value(s);
    return 0;
}
void List::insert_at_beginning(int d, char c)
{
    Node *n = new Node;
    n->data = d;
    n->grade = c;
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
            flag = true;
            break;
        }
        temp = temp->next;
    }
    if (flag == false)
    {
        cout << "You have not appeared for the Contest-1" << endl;
    }
    else
    {
        cout << "You have secured " << temp->grade << " grade";
    }
}