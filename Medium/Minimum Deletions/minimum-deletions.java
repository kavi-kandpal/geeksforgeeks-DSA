//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int minimumNumberOfDeletions(String S) {
        int n = S.length();
        // Create a 2D array to store the minimum deletions required to make substrings palindromic
        int[][] dp = new int[n][n];

        // Initialize the dp array for strings of length 1 (single characters are palindromes)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // Fill the dp array for substrings of length 2 or more
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // The minimum number of deletions required to make the entire string a palindrome is stored in dp[0][n-1]
        return dp[0][n - 1];
    }
}
