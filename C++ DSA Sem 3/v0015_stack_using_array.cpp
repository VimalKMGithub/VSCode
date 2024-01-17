#include <iostream>
using namespace std;
int stack[100], n = 100, top = -1;
void push(int val)
{
    if (top >= n - 1)
    {
        cout << "Stack is already filled" << endl;
    }
    else
    {
        top++;
        stack[top] = val;
    }
}
void pop()
{
    if (top <= -1)
    {
        cout << "Empty stack" << endl;
    }
    else
    {
        cout << "Element removed : " << stack[top] << endl;
        top--;
    }
}
void peek()
{
    if (top >= 0)
    {
        cout << "Stack : " << endl;
        for (int i = top; i >= 0; i--)
        {
            cout << stack[i] << endl;
        }
    }
    else
    {
        cout << "No elements in stack to display" << endl;
    }
}
int main()
{
    int ch, item;
    cout << "1. to push" << endl;
    cout << "2. to pop" << endl;
    cout << "3. to peek" << endl;
    cout << "4. exit" << endl;
    do
    {
        cout << "Enter your choice : ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "Enter value you want to push : ";
            cin >> item;
            push(item);
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            break;
        default:
            cout << "Invalid choice" << endl;
            break;
        }
    } while (ch != 4);
    return 0;
}