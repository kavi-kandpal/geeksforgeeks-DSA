//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
   static int equalPartition(int N, int arr[]) {
    int totalSum = 0;
    for (int num : arr) {
        totalSum += num;
    }

    // If the total sum is odd, it's not possible to partition into two equal parts
    if (totalSum % 2 != 0) {
        return 0;
    }

    int targetSum = totalSum / 2;

    // Create a DP array to store the results of subproblems
    boolean dp[][] = new boolean[N + 1][targetSum + 1];

    // Initialization
    for (int i = 0; i <= N; i++) {
        dp[i][0] = true;
    }

    // Dynamic programming
    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= targetSum; j++) {
            if (arr[i - 1] > j) {
                dp[i][j] = dp[i - 1][j];
            } else {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }
    }

    // The result is stored in dp[N][targetSum]
    return dp[N][targetSum] ? 1 : 0;
}
}