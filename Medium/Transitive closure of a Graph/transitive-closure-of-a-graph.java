//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            
            for(int i = 0;i < N;i++)
                {String a[] = in.readLine().trim().split("\\s+");
                for(int j=0;j<N;j++)
                graph[i][j] = Integer.parseInt(a[j]);}
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for(int i = 0;i < N;i++)
               { for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
            System.out.println();}
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// import java.util.ArrayList;

class Solution {
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        int[][] transitiveClosure = new int[N][N];
        
        // Initialize the transitive closure matrix with the input graph
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                transitiveClosure[i][j] = graph[i][j];
            }
        }

        // Set the diagonal elements to 1 (each vertex is reachable from itself)
        for (int i = 0; i < N; i++) {
            transitiveClosure[i][i] = 1;
        }

        // Floyd-Warshall algorithm to compute the transitive closure
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // If there is a path from i to j through k, update the transitive closure
                    if (transitiveClosure[i][k] == 1 && transitiveClosure[k][j] == 1) {
                        transitiveClosure[i][j] = 1;
                    }
                }
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            result.add(new ArrayList<Integer>());
            for (int j = 0; j < N; j++) {
                result.get(i).add(transitiveClosure[i][j]);
            }
        }

        return result;
    }
}

