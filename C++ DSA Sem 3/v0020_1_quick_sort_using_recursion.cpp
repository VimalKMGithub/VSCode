#include <iostream>
using namespace std;
void swapping(int arr[], int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swapping(arr, i, j);
        }
    }
    swapping(arr, i + 1, high);
    return (i + 1);
}
void quick_sort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quick_sort(arr, low, pi - 1);
        quick_sort(arr, pi + 1, high);
    }
}
int main()
{
    int num;
    cout << "Enter number of elements : ";
    cin >> num;
    int array[num];
    cout << "Enter elements" << endl;
    for (int i = 0; i < num; i++)
    {
        cin >> array[i];
    }
    cout << "Before Sorting : ";
    for (int i = 0; i < num; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
    quick_sort(array, 0, num - 1);
    cout << "After Sorting : ";
    for (int i = 0; i < num; i++)
    {
        cout << array[i] << " ";
    }
    return 0;
}