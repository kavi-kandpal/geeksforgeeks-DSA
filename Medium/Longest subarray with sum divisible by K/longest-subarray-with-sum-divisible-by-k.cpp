//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
#include <unordered_map>
#include <algorithm>
using namespace std;

class Solution {
public: 
    int longSubarrWthSumDivByK(int arr[], int n, int k) {
        unordered_map<int, int> remainderMap;
        remainderMap[0] = -1;

        int sum = 0;
        int largest = 0;

        for (int i = 0; i < n; ++i) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0) rem += k;

            if (remainderMap.find(rem) != remainderMap.end()) {
                largest = max(largest, i - remainderMap[rem]);
            } else {
                remainderMap[rem] = i;
            }
        }

        return largest;
    }
};


//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n,k,i;
	cin>>n>>k; int arr[n];
	for(i=0;i<n;i++)
	cin>>arr[i];
	Solution ob;
	cout<<ob.longSubarrWthSumDivByK(arr, n, k)<<"\n";
	}
	return 0;	 
}

// } Driver Code Ends