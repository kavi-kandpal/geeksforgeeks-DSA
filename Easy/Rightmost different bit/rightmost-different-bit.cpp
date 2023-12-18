//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;
 

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
    int posOfRightMostDiffBit(int m, int n)
    {
        if (m == n) 
        {
            return -1;
        }
        int position = 1;
        while (((m & 1) == (n & 1)) && (m > 0) && (n > 0)) 
        {
            m = m >> 1;
            n = n >> 1;
            position++;
        }
        return position;
    }
};

//{ Driver Code Starts.

// Driver Code
int main()
{   
    int t;
    cin>>t; //input number of testcases
    while(t--)
    {
         int m,n;
         cin>>m>>n; //input m and n
         Solution ob;
         cout << ob.posOfRightMostDiffBit(m, n)<<endl;
    }
    return 0;     
} 
// } Driver Code Ends