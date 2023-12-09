//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
  int sumOfNum(int n){
        int sum=0;
        while(n){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    
    
    
    bool isPrime(int n)
    {
    // Corner case
    if (n <= 1)
        return false;
 
    for (int i = 2; i <= n / 2; i++)
        if (n % i == 0)
            return false;
 
    return true;
    }
    
    
    
    int primeFactors(int n)  
    {  
    int ans=0;
    while (n % 2 == 0)  
    {  
        ans+=2;  
        n = n/2;  
    }  
  

    for (int i = 3; i <= sqrt(n); i = i + 2)  
    {  
        while (n % i == 0)  
        {  
            ans+=sumOfNum(i);  
            n = n/i;  
        }  
    }  
 
    if (n > 2)  {
        ans+=sumOfNum(n);  
        
    }
        
    return ans;
    }
    
    
    
    
    int smithNum(int n) {
        if(sumOfNum(n) == primeFactors(n)){
            if(!isPrime(n)){
                return true;
            }
        }return false;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        
        cin>>n;

        Solution ob;
        cout << ob.smithNum(n) << endl;
    }
    return 0;
}
// } Driver Code Ends