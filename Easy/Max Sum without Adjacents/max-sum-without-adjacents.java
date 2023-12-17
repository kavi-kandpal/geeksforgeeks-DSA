//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==2)
 {
 return Math.max(arr[0],arr[1]);
 }
int p1=0;
int p2=arr[0];
for(int i=1;i<n;i++)
 {
 int take=arr[i]+p1;
 int nottake=p2;
p1=p2;
 p2=Math.max(take,nottake);
 }
return p2;
}
}