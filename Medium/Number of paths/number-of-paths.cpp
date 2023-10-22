//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
 

// } Driver Code Ends

class Solution
{
public:
    long long binomialCoefficient(int n, int k)
    {
        const int MOD = 1e9 + 7;
        
        if (k == 0 || k == n)
            return 1;

        long long result = 1;
        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; i++)
        {
            result = (result * (n - i)) % MOD;
            result = (result * modInverse(i + 1, MOD)) % MOD;
        }

        return result;
    }
    
    long long modInverse(int a, int m)
    {
        int m0 = m;
        int x0 = 0;
        int x1 = 1;

        while (a > 1)
        {
            int q = a / m;
            int t = m;

            m = a % m;
            a = t;

            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0)
            x1 += m0;

        return x1;
    }

    long long numberOfPaths(int M, int N)
    {
        return binomialCoefficient(M + N - 2, min(M - 1, N - 1));
    }
};
// gfg


//{ Driver Code Starts.

 
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int N, M;
		cin>>M>>N;
		Solution ob;
	    cout << ob.numberOfPaths(M, N)<<endl;
	}
    return 0;
}
// } Driver Code Ends