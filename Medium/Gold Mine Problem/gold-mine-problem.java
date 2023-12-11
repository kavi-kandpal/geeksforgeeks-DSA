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
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int dp[][] = new int[n][m];

        // Copy the values of the last column
        for (int i = 0; i < n; i++) {
            dp[i][m - 1] = M[i][m - 1];
        }

        // Calculate maximum gold starting from the last column going towards the first
        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                // Possible moves: down, right-down, up
                int moveDown = (i == 0) ? 0 : dp[i - 1][j + 1];
                int moveRightDown = dp[i][j + 1];
                int moveUp = (i == n - 1) ? 0 : dp[i + 1][j + 1];

                // Max gold that can be collected at current cell
                dp[i][j] = M[i][j] + Math.max(moveDown, Math.max(moveRightDown, moveUp));
            }
        }

        // Find the maximum value in the first column
        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, dp[i][0]);
        }

        return maxGold;
    }
}
