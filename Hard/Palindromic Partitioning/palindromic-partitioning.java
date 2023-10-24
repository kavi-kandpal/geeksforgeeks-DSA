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
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int palindromicPartition(String str) {
        int n = str.length();

        // Create a 2D table to store if substrings are palindromes
        boolean[][] isPalindrome = new boolean[n][n];

        // Initialize the table for substrings of length 1
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Calculate the table for substrings of length 2 and more
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (str.charAt(i) == str.charAt(j) && cl == 2) {
                    isPalindrome[i][j] = true;
                } else if (str.charAt(i) == str.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                }
            }
        }

        // Create an array to store the minimum number of cuts
        int[] minCuts = new int[n];

        // Initialize the minCuts array
        for (int i = 0; i < n; i++) {
            if (isPalindrome[0][i]) {
                minCuts[i] = 0;
            } else {
                minCuts[i] = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (isPalindrome[j + 1][i] && minCuts[i] > minCuts[j] + 1) {
                        minCuts[i] = minCuts[j] + 1;
                    }
                }
            }
        }

        // The value at the last index of minCuts will be the answer
        return minCuts[n - 1];
    }
}