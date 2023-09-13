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
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int N, int S) {
    // Check if it's possible to create a number with N digits and sum of digits equal to S
    if (S == 0 && N == 1) {
        return "0";
    }
    if (S < 1 || S > 9 * N) {
        return "-1";
    }

    StringBuilder result = new StringBuilder();
    while (N > 0) {
        // Try to add the largest possible digit (9) while S allows it
        if (S >= 9) {
            result.append("9");
            S -= 9;
        } else {
            // Add the remaining S as a digit
            result.append(Integer.toString(S));
            S = 0;
        }
        N--;
    }

    // Add any remaining zeros to complete N digits
    while (N > 0) {
        result.append("0");
        N--;
    }

    return result.toString();
}

// Test cases
public static void main(String[] args) {
    System.out.println(findLargest(2, 9));  // Output: "90"
    System.out.println(findLargest(3, 20)); // Output: "992"
}

}