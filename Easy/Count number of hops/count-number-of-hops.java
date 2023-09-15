//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
   static long countWays(int n) {
    // Define an array to store the number of ways to reach each step.
    // Initialize it with zeros, and set the number of ways to reach the 0th step as 1.
    long[] dp = new long[n + 1];
    dp[0] = 1;

    // Loop through all possible steps from 1 to n.
    for (int i = 1; i <= n; i++) {
        // The frog can jump 1, 2, or 3 steps, so we add the number of ways
        // to reach the previous 3 steps to get the number of ways to reach the current step.
        dp[i] = dp[i] % 1000000007 + dp[i - 1] % 1000000007;
        if (i >= 2) {
            dp[i] = dp[i] % 1000000007 + dp[i - 2] % 1000000007;
        }
        if (i >= 3) {
            dp[i] = dp[i] % 1000000007 + dp[i - 3] % 1000000007;
        }
    }

    // The answer is stored in dp[n].
    return dp[n] % 1000000007;
}

// Example usage:

    
}

