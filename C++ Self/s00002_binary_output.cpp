#include <iostream>
#include <bitset>
#include <cmath>
using namespace std;

// 1st method
void bin(int n)
{
    if (n > 1)
        bin(n / 2);
    cout << n % 2;
}

// 2nd method
void bin_2(int n)
{
    if (n > 1)
        bin(n >> 1);
    cout << (n & 1);
}
int main()
{
    int a;
    cin >> a;

    // 1st method
    if (a > 0)
    {
        bin(a);
    }
    else
    {
        cout << "-";
        bin(abs(a));
    }

    // 2nd method
    // if (a > 0)
    // {
    //     bin_2(a);
    // }
    // else
    // {
    //     cout << "-";
    //     bin_2(abs(a));
    // }

    // 3rd method
    // if (a > 0)
    // {
    //     cout << bitset<32>(a).to_string().substr(32 - log2(a));
    // }
    // else
    // {
    //     cout << "-";
    //     cout << bitset<32>(abs(a)).to_string().substr(32 - log2(abs(a)));
    // }
    return 0;
}