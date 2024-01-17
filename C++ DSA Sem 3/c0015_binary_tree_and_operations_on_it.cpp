#include <iostream>
using namespace std;
struct node
{
    int data;
    node *left, *right;
    node(int data)
    {
        this->data = data;
        left = right = NULL;
    }
};
void pre_order(struct node *nod)
{
    if (nod == NULL)
    {
        return;
    }
    cout << nod->data << " ";
    pre_order(nod->left);
    pre_order(nod->right);
}
void in_order(struct node *nod)
{
    if (nod == NULL)
    {
        return;
    }
    in_order(nod->left);
    cout << nod->data << " ";
    in_order(nod->right);
}
void post_order(struct node *nod)
{
    if (nod == NULL)
    {
        return;
    }
    post_order(nod->left);
    post_order(nod->right);
    cout << nod->data << " ";
}
int main()
{
    struct node *root = new node(89);
    root->left = new node(20);
    root->right = new node(83);
    root->left->left = new node(46);
    root->left->right = new node(85);
    cout << "Pre order : ";
    pre_order(root);
    cout << endl;
    cout << "In order : ";
    in_order(root);
    cout << endl;
    cout << "Post order : ";
    post_order(root);
    return 0;
}