#include <iostream>
using namespace std;
void toh(int n, string beg, string Aux, string end)
{
    if (n == 1)
    {
        cout << "Move Disk " << n << " from " << beg << " to " << end << endl;
        return;
    }
    toh(n - 1, beg, end, Aux);
    cout << "Move Disk " << n << " from " << beg << " to " << end << endl;
    toh(n - 1, Aux, beg, end);
}
int main()
{
    int n;
    cout << "Enter number of disks : ";
    cin >> n;
    string be = "Beg", au = "Aux", en = "End";
    toh(n, be, au, en);
    return 0;
}