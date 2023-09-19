//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
   public static int getFirstSetBit(int n) {
    // Initialize position to 1
    int position = 1;
    
    // Check each bit from right to left
    while (n > 0) {
        // If the current bit is set (i.e., it's 1), return the position
        if ((n & 1) == 1) {
            return position;
        }
        
        // Move to the next bit and increment the position
        n >>= 1;
        position++;
    }
    
    // If no set bit is found, return 0
    return 0;
}

}