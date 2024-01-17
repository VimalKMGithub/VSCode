#include <iostream>
using namespace std;
void bin(int n)
{
    if (n > 1)
        bin(n / 2);
    cout << n % 2;
}
int main()
{
    // direct initialization in all format
    int a = 15; // dec
    a = 017;    // oct
    a = 0xf;    // hex
    a = 0b1111; // bin

    // input as dec, hex or oct but not bin
    cin >> dec >> a; // dec
    cin >> hex >> a; // hex
    cin >> oct >> a; // oct

    // input in all format
    char input[100];
    char *endpointer;
    cin >> input;
    a = (int)strtol(input, &endpointer, 2); // 2-bin, 8-oct, 16-hex, 10-dec

    // octput in dec, hex or oct but not bin
    cout << dec << a; // dec
    cout << hex << a; // hex
    cout << oct << a; // oct

    // output in bin
    if (a > 0)
    {
        bin(a);
    }
    else
    {
        cout << "-";
        bin(abs(a));
    }
    return 0;
}