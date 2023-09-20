//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// import java.util.ArrayList;
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
    // Initialize an ArrayList to store the results
    // Initialize an ArrayList to store the results
    ArrayList<Integer> result = new ArrayList<>();

    // Convert N to its binary representation with 16 bits
    String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

    // Calculate the effective rotation value (D modulo 16)
    int effectiveD = D % 16;

    // Left rotation
    String leftRotated = binaryN.substring(effectiveD) + binaryN.substring(0, effectiveD);
    int leftDecimal = Integer.parseInt(leftRotated, 2);
    result.add(leftDecimal);

    // Right rotation
    String rightRotated = binaryN.substring(16 - effectiveD) + binaryN.substring(0, 16 - effectiveD);
    int rightDecimal = Integer.parseInt(rightRotated, 2);
    result.add(rightDecimal);

    return result;
}
}