#include <iostream>
using namespace std;
int main()
{
    int n = 0;
    cout << "Enter number of elements : ";
    cin >> n;
    int array[n + 1] = {}, index = 0, value = 0;
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
         << "At what index position you want to insert an element : ";
    cin >> index;
    cout << "What value you want to insert : ";
    cin >> value;
    for (int j = n; j >= index; j--)
    {
        array[j + 1] = array[j];
    }
    array[index] = value;
    cout << "Updated array : ";
    for (int i = 0; i < n + 1; i++)
    {
        cout << "array[" << i << "] = " << array[i] << ", ";
    }
    return 0;
}