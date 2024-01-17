#include <iostream>
using namespace std;
int main()
{
    int n = 0;
    cout << "Enter number of elements : ";
    cin >> n;
    int array[n] = {};
    cout << "Enter elements in ***ascending order***" << endl;
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
    int value = 0, start = 0, end = n, flag = 0;
    cout << endl
         << "Enter element to search : ";
    cin >> value;
    while (start <= end)
    {
        int mid = int((start + end) / 2);
        if (array[start] == value)
        {
            cout << "Element found at array[" << start << "] = " << array[start];
            flag++;
            break;
        }
        else if (array[end] == value)
        {
            cout << "Element found at array[" << end << "] = " << array[end];
            flag++;
            break;
        }
        else if (array[mid] == value)
        {
            cout << "Element found at array[" << mid << "] = " << array[mid];
            flag++;
            break;
        }
        else if (array[mid] > value)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    if (flag == 0)
    {
        cout << "Element not found";
    }
    return 0;
}