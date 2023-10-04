//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     public long substrCount(String S, int K) {
        return atMostKDistinct(S, K) - atMostKDistinct(S, K - 1);
    }

    private int atMostKDistinct(String S, int K) {
        int[] charCount = new int[26];
        int count = 0;
        int left = 0;

        for (int right = 0; right < S.length(); right++) {
            if (charCount[S.charAt(right) - 'a'] == 0) {
                K--;
            }
            charCount[S.charAt(right) - 'a']++;

            while (K < 0) {
                if (charCount[S.charAt(left) - 'a'] == 1) {
                    K++;
                }
                charCount[S.charAt(left) - 'a']--;
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}