//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
public:
    void shuffleArray(int arr[], int n) {
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            std::rotate(arr + 2 * i + 1, arr + mid + i, arr + mid + i + 1);
        }
    }
};

//C++
//POTD SOLUTION(GFG)
// 25 Nov 2023

//{ Driver Code Starts.


int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
	    cin>>n;
	    int a[n] ;
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }


       

        Solution ob;
        ob.shuffleArray(a, n);

		for (int i = 0; i < n; i++) 
			cout << a[i] << " ";
    
	
        
	    cout << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends