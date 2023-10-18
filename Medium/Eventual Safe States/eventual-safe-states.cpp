//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:
    vector<int> eventualSafeNodes(int V, vector<int> adj[]) {
        vector<int> result;
        vector<int> color(V, 0); // 0: not visited, 1: visiting, 2: visited
        
        for (int i = 0; i < V; i++) {
            if (isSafe(i, adj, color)) {
                result.push_back(i);
            }
        }
        
        return result;
    }
    
    bool isSafe(int node, vector<int> adj[], vector<int>& color) {
        if (color[node] == 1) {
            // This node is being visited again in the same traversal, indicating a cycle.
            return false;
        }
        if (color[node] == 2) {
            // This node has already been visited and confirmed safe.
            return true;
        }
        
        color[node] = 1; // Mark the node as visiting
        
        for (int neighbor : adj[node]) {
            if (!isSafe(neighbor, adj, color)) {
                return false;
            }
        }
        
        color[node] = 2; // Mark the node as visited and safe
        return true;
    }
};
//GFG 18 oct C++


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {

        int V, E;
        cin >> V >> E;
        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
        }

        Solution obj;
        vector<int> safeNodes = obj.eventualSafeNodes(V, adj);
        for (auto i : safeNodes) {
            cout << i << " ";
        }
        cout << endl;
    }
}

// } Driver Code Ends