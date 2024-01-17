#include <iostream>
using namespace std;
void tower_of_hanoi(int n, string beg, string end, string aux)
{
    if (n == 0)
    {
        return;
    }
    tower_of_hanoi(n - 1, beg, aux, end);
    cout << "Move Disk " << n << " from " << beg << " to " << end << endl;
    tower_of_hanoi(n - 1, aux, end, beg);
}
int main()
{
    int n;
    string be = "Beg", en = "End", au = "Aux";
    cout << "Enter number of discs : ";
    cin >> n;
    tower_of_hanoi(n, be, en, au);
    return 0;
}