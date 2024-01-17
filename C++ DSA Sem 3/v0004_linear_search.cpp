#include <iostream>
using namespace std;
int main()
{
    int n = 0;
    cout << "Enter number of elements : ";
    cin >> n;
    int array[n] = {}, index = 0, value = 0, flag = 0;
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
    cout << endl;
    cout << "Enter element to search : ";
    cin >> value;
    for (int i = 0; i < n; i++)
    {
        if (array[i] == value)
        {
            cout << "Element found at array[" << i << "] = " << array[i] << ", ";
            flag++;
        }
    }
    if (flag == 0)
    {
        cout << "Element not found" << endl;
    }
    return 0;
}