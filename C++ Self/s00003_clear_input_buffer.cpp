#include <iostream>
#include <limits>
using namespace std;
int main()
{
    int a;
    cout << "Enter a number : ";
    cin >> a;
    cout << "Number : " << a << endl;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    string b;
    cout << "Enter a string : ";
    getline(cin, b);
    cout << "String : " << b;
    return 0;
}