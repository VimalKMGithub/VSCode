#include <bits/stdc++.h>
using namespace std;
string solution(int N, vector<string> S)
{
    return "";
}
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    vector<string> S(N);
    for (int i_S = 0; i_S < N; i_S++)
    {
        cin >> S[i_S];
    }
    string out_;
    out_ = solution(N, S);
    cout << out_;
}