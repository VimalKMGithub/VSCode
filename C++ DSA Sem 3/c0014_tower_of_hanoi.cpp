#include <iostream>
using namespace std;

void TOH(int n, char beg, char Aux, char end)
{
    if (n == 1)
    {
        cout << "Move Disk " << n << " from " << beg << " to " << end << endl;
        return;
    }

    TOH(n - 1, beg, end, Aux);
    cout << "Move Disk " << n << " from " << beg << " to " << end << endl;
    TOH(n - 1, Aux, beg, end);
}
int main()
{
    int n;

    cout << "Enter no. of disks:";
    cin >> n;
    // calling the TOH
    TOH(n, 'B', 'A', 'E');
    return 0;
}