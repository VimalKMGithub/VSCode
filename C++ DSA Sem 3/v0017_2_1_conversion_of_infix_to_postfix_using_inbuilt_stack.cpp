/* Associativity of all operators is taken from left to right */
#include <iostream>
#include <stack>
using namespace std;
int prec(char c);
void infix_to_postfix(string infix);
int main()
{
    string infix;
    cout << "Enter the infix expression : ";
    getline(cin, infix);
    cout << "Postfix expression : ";
    infix_to_postfix(infix);
    return 0;
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
void infix_to_postfix(string infix)
{
    stack<char> sk;
    int i = 0;
    char ch, x;
    /*
    for (int i = 0; i < infix.length(); i++)
    {
        code inside while loop
    }
    */
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
            while (sk.top() != '(')
            {
                x = sk.top();
                sk.pop();
                cout << x;
            }
            sk.pop();
        }
        else
        {
            while (!sk.empty() && prec(ch) <= prec(sk.top()))
            {
                x = sk.top();
                sk.pop();
                cout << x;
            }
            sk.push(ch);
        }
    }
    while (!sk.empty())
    {
        x = sk.top();
        sk.pop();
        cout << x;
    }
}