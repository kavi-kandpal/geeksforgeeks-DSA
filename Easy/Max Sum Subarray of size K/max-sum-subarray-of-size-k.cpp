//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

//sliding window technique
class Solution{   
public:
    long maximumSumSubarray(int k, vector<int> &a , int n){
        // code here 
        //sliding window technique
        long sum=0;
        for(long i=0; i<k;i++){
            sum+=a[i];
        }
        long ans=sum;
        long del=0;
        for(long i=k;i<n;i++){
            sum+=a[i];
            sum-=a[del];
            del++;
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
};

//POTD 11-12-2023
//C++

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N,K;
        cin >> N >> K;;
        vector<int>Arr;
        for(int i=0;i<N;++i){
            int x;
            cin>>x;
            Arr.push_back(x);
        }
        Solution ob;
        cout << ob.maximumSumSubarray(K,Arr,N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends