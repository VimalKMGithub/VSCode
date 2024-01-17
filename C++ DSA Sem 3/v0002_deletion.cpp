#include <iostream>
using namespace std;
int main()
{
    int n = 0;
    cout << "Enter number of elements : ";
    cin >> n;
    int array[n] = {}, index = 0;
    cout << "Enter elements" << endl;
    for (int i = 0; i < n; i++)
    {
        cout << "array[" << i << "] = ";
        cin >> array[i];
    }
    cout << "Array : ";
    for (int i = 0; i < n; i++)
    {
        cout << "array[" << i << "] = " << array[i] << ", ";
    }
    cout << endl
         << "From what index position you want to delete an element : ";
    cin >> index;
    for (int j = index; j < n - 1; j++)
    {
        array[j] = array[j + 1];
    }
    cout << "Updated array : ";
    for (int i = 0; i < n - 1; i++)
    {
        cout << "array[" << i << "] = " << array[i] << ", ";
    }
    return 0;
}