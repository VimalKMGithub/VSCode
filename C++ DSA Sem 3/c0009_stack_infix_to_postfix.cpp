#include <iostream>
using namespace std;
class Stack
{
public:
    char s[20];
    int top, MAX;
    Stack();
    void push(char t);
    char pop();
    int IsEmpty();
    char getTop();
    int InsideStackOperatorPriority(char); // In Stack Priority
    int IncomingOperatorPriority(char);    // InComing Priority
    void Infix_to_Postfix(char infix[20]);
};
Stack::Stack()
{
    top = -1;
    MAX = 20;
}
void Stack::push(char t)
{
    if (top == MAX - 1)
        cout << "Stack is overflow" << endl;
    else
        s[++top] = t;
}
char Stack::pop()
{
    char ch;
    if (top == -1)
        cout << "Stack is underflow" << endl;
    else
    {
        ch = s[top];
        top--;
    }
    return ch;
}
int Stack::IsEmpty()
{
    if (top == -1)
        return 1;
    else
        return 0;
}
char Stack::getTop()
{
    char ch;
    if (IsEmpty())
        cout << "Stack is empty" << endl;
    else
    {
        ch = s[top];
    }
    return ch;
}
int Stack::InsideStackOperatorPriority(char ch)
{
    switch (ch)
    {
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    case '^':
        return 3;
    case '(':
        return 0;
    case '#':
        return -1;
    }
}
int Stack::IncomingOperatorPriority(char ch)
{

    switch (ch)
    {
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    case '^':
        return 3;
    case '(':
        return 4;
    }
}
void Stack::Infix_to_Postfix(char infix[20])
{
    Stack sk;
    int i = 0;
    char ch, x;
    sk.push('#');
    while (infix[i] != '\0')
    {
        ch = infix[i];
        i++;
        if (ch >= 'a' && ch <= 'z')
            cout << ch;
        else
        {
            if (ch == ')')
            {
                while (sk.getTop() != '(')
                {
                    x = sk.pop();
                    cout << x;
                }
                sk.pop(); // to remove open ( from stack
            }
            else
            {
                while (InsideStackOperatorPriority(sk.getTop()) >= IncomingOperatorPriority(ch))
                {
                    x = sk.pop();
                    cout << x;
                }
                sk.push(ch);
            }
        }
    } // while loop closed
    while (!sk.IsEmpty())
    {
        x = sk.pop();
        if (x != '#')
            cout << x;
    }
}
int main()
{
    Stack sk;
    char infix[20];
    cout << "Enter the infix expression : ";
    cin >> infix;
    sk.Infix_to_Postfix(infix);
    return 0;
}