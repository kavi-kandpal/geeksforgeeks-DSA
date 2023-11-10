//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String printMinNumberForPattern(String S) {
        // Initialize an empty stack to store digits
        Stack<Integer> stack = new Stack<>();
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through the pattern
        for (int i = 0; i <= S.length(); i++) {
            // Push the current index to the stack
            stack.push(i + 1);
            
            // If we encounter 'I' or reach the end of the pattern, pop elements from the stack and append to the result
            if (i == S.length() || S.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }
}