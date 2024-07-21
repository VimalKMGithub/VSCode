#include <iostream>
using namespace std;
class x1
{
public:
    template <typename T>
    T add(T a, T b)
    {
        return a + b;
    }
};
int main()
{
    x1 obj;
    cout << obj.add(10, 20) << endl;
    cout << obj.add(10.5, 20.5) << endl;
    return 0;
}
