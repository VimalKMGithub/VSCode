/* Associativity of all operators is taken from left to right */
#include <iostream>
using namespace std;
class stack
{
    char s[100];
    int top = -1, max = 100;

public:
    void push(char t);
    char pop();
    char get_top();
    bool is_empty();
};
int prec(char c);
void infix_to_postfix(char infix[]);
int main()
{
    char infix[100];
    cout << "Enter the infix expression : ";
    cin >> infix;
    cout << "Postfix expression : ";
    infix_to_postfix(infix);
    return 0;
}
void stack::push(char t)
{
    if (top == max - 1)
    {
    }
    else
    {
        top++;
        s[top] = t;
    }
}
char stack::pop()
{
    if (top == -1)
    {
        return ' ';
    }
    else
    {
        char ch;
        ch = s[top];
        top--;
        return ch;
    }
}
char stack::get_top()
{
    if (top == -1)
    {
        return ' ';
    }
    else
    {
        char ch;
        ch = s[top];
        return ch;
    }
}
bool stack::is_empty()
{
    if (top == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int prec(char c)
{
    if (c == '^')
    {
        return 3;
    }
    else if (c == '/' || c == '*')
    {
        return 2;
    }
    else if (c == '+' || c == '-')
    {
        return 1;
    }
    else
    {
        return -1;
    }
}
void infix_to_postfix(char infix[])
{
    stack sk;
    int i = 0;
    char ch, x;
    while (infix[i] != '\0')
    {
        ch = infix[i];
        i++;
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')
        {
            cout << ch;
        }
        else if (ch == '(')
        {
            sk.push('(');
        }
        else if (ch == ')')
        {
            while (sk.get_top() != '(')
            {
                x = sk.pop();
                cout << x;
            }
            sk.pop();
        }
        else
        {
            while (!sk.is_empty() && prec(ch) <= prec(sk.get_top()))
            {
                x = sk.pop();
                cout << x;
            }
            sk.push(ch);
        }
    }
    while (!sk.is_empty())
    {
        x = sk.pop();
        cout << x;
    }
}