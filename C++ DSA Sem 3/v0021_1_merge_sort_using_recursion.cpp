#include <iostream>
using namespace std;
void merge(int arr[], int low, int mid, int max);
void merge_sort(int arr[], int low, int max);
int main()
{
    int num;
    cout << "Enter number of elements : ";
    cin >> num;
    int array[num];
    cout << "Enter elements of array" << endl;
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
    merge_sort(array, 0, num - 1);
    cout << "After Sorting : ";
    for (int i = 0; i < num; i++)
    {
        cout << array[i] << " ";
    }
    return 0;
}
void merge(int arr[], int low, int mid, int max)
{
    int num_1 = mid - low + 1;
    int num_2 = max - mid;
    int arr_1[num_1], arr_2[num_2];
    for (int i = 0; i < num_1; i++)
    {
        arr_1[i] = arr[low + i];
    }
    for (int i = 0; i < num_2; i++)
    {
        arr_2[i] = arr[mid + 1 + i];
    }
    int i = 0, j = 0, k = low;
    while (i < num_1 && j < num_2)
    {
        if (arr_1[i] < arr_2[j])
        {
            arr[k] = arr_1[i];
            i++;
        }
        else
        {
            arr[k] = arr_2[j];
            j++;
        }
        k++;
    }
    while (i < num_1)
    {
        arr[k] = arr_1[i];
        i++;
        k++;
    }
    while (j < num_2)
    {
        arr[k] = arr_2[j];
        j++;
        k++;
    }
}
void merge_sort(int arr[], int low, int max)
{
    if (low < max)
    {
        int mid = (low + max) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, max);
        merge(arr, low, mid, max);
    }
}