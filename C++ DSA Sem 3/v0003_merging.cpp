#include <iostream>
using namespace std;
int main()
{
    int n_one = 0, n_two = 0;
    cout << "Enter number of elements in 1st array : ";
    cin >> n_one;
    int ar_one[n_one] = {};
    cout << "Enter elements in ***ascending order***" << endl;
    for (int i = 0; i < n_one; i++)
    {
        cout << "ar_one[" << i << "] = ";
        cin >> ar_one[i];
    }
    cout << "Enter number of elements in 2nd array : ";
    cin >> n_two;
    int ar_two[n_two] = {};
    cout << "Enter elements in ***ascending order***" << endl;
    for (int i = 0; i < n_two; i++)
    {
        cout << "ar_two[" << i << "] = ";
        cin >> ar_two[i];
    }
    cout << "First array : ";
    for (int i = 0; i < n_one; i++)
    {
        cout << ar_one[i] << ", ";
    }
    cout << endl
         << "Second array : ";
    for (int i = 0; i < n_two; i++)
    {
        cout << ar_two[i] << ", ";
    }

    int ar_three[n_one + n_two] = {}, temp_na = 0, temp_nb = 0, temp_nc = 0;
    while (temp_na < n_one && temp_nb < n_two)
    {
        if (ar_one[temp_na] <= ar_two[temp_nb])
        {
            ar_three[temp_nc] = ar_one[temp_na];
            temp_na++;
        }
        else
        {
            ar_three[temp_nc] = ar_two[temp_nb];
            temp_nb++;
        }
        temp_nc++;
    }
    while (temp_na < n_one)
    {
        ar_three[temp_nc] = ar_one[temp_na];
        temp_na++;
        temp_nc++;
    }
    while (temp_nb < n_two)
    {
        ar_three[temp_nc] = ar_two[temp_nb];
        temp_nb++;
        temp_nc++;
    }
    cout << endl
         << "Merged array : ";
    for (int i = 0; i < temp_nc; i++)
    {
        cout << ar_three[i] << ", ";
    }
    return 0;
}