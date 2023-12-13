//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;
#define ll long long

// } Driver Code Ends
//User function template for C++
class Solution{
public:
    // #define ll long long
    int mod=1e9+7;
    ll countStrings(int n) {
        // code here
        ll prev1=2;
        ll prev2=1;
        
        for(int i=2;i<=n;i++){
            ll t=(prev1+prev2)%mod;
            prev2=prev1;
            prev1=t;
        }
        
        return prev1;
    }
};


//CPP
//POTD SOLUTION(GFG)
// 13 December 2023

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        auto ans = ob.countStrings(n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends