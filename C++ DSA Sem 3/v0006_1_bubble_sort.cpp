#include <iostream>
using namespace std;
int main()
{
    int n = 0;
    cout << "Enter number of elements : ";
    cin >> n;
    int array[n] = {};
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
    for (int i = 0; i < n - 1; i++)
    {
        bool swapped = false;
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (array[j] > array[j + 1])
            {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        if (swapped == false)
        {
            break;
        }
    }
    cout << endl
         << "Sorted array : ";
    for (int i = 0; i < n; i++)
    {
        cout << "array[" << i << "] = " << array[i] << ", ";
    }
    return 0;
}