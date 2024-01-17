#include <iostream>
using namespace std;
int main()
{
    int n1;
    cin >> n1;
    int ar1[n1];
    for (int i = 0; i < n1; i++)
    {
        cin >> ar1[i];
    }
    int n2;
    cin >> n2;
    int ar2[n2];
    for (int i = 0; i < n2; i++)
    {
        cin >> ar2[i];
    }
    int ar3[n1 + n2];
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2)
    {
        ar3[k++] = ar1[i++];
        ar3[k++] = ar2[j++];
    }
    for (int l = 0; l < k; l++)
    {
        cout << ar3[l] << " ";
    }
    cout << endl;
    for (int m = j; m < n2; m++)
    {
        cout << ar2[m] << " ";
    }
    return 0;
}
