//{ Driver Code Starts
#include <iostream>
#include <map>
#include <algorithm>
#include <cstdlib>
#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends

class Solution {
public:
    vector<string> winner(string arr[], int n) {
        unordered_map<string, int> voteCount;

        // Counting votes for each candidate
        for (int i = 0; i < n; i++) {
            voteCount[arr[i]]++;
        }

        // Finding the candidate with maximum votes
        int maxVotes = 0;
        string winner;
        for (const auto& entry : voteCount) {
            if (entry.second > maxVotes || (entry.second == maxVotes && entry.first < winner)) {
                winner = entry.first;
                maxVotes = entry.second;
            }
        }

        // Returning the result
        return {winner, to_string(maxVotes)};
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    
    for(int i=0;i<t;i++)
    {
        
        
        int n;
        cin>>n;
        
        string arr[n];
        
        for (int i=0;i<n;i++)
        cin>>arr[i];
        Solution obj;
        vector<string> result = obj.winner(arr,n);
        
        cout<<result[0] << " " << result[1] << endl;
    }
    return 0;
}

// } Driver Code Ends