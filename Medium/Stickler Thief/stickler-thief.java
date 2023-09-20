//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return arr[0];
    }

    // Create two arrays to store maximum money including and excluding the current house
    int[] dpInclude = new int[n];
    int[] dpExclude = new int[n];

    dpInclude[0] = arr[0];
    dpExclude[0] = 0;

    for (int i = 1; i < n; i++) {
        // Maximum money including the current house is the sum of money in the current house
        // and the maximum money excluding the previous house
        dpInclude[i] = arr[i] + dpExclude[i - 1];

        // Maximum money excluding the current house is the maximum of the maximum money including
        // and excluding the previous house
        dpExclude[i] = Math.max(dpInclude[i - 1], dpExclude[i - 1]);
    }

    // The final answer is the maximum of the last two elements of these arrays
    return Math.max(dpInclude[n - 1], dpExclude[n - 1]);
}

}