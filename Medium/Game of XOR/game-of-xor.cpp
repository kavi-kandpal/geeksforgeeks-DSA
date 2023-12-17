//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {public:
    int gameOfXor(int N, int A[]) {        int result = 0;
        for (int i = 0; i < N; i++) {            int count = (i + 1) * (N - i);
            if (count % 2 == 1) {                result ^= A[i];
            }        }
        return result;    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int A[N];
        for(int i=0 ; i<N ; i++)
            cin>>A[i];

        Solution ob;
        cout << ob.gameOfXor(N,A) << endl;
    }
    return 0;
}
// } Driver Code Ends