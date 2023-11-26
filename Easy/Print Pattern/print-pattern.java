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
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
        public List<Integer> pattern(int N){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(N<=0){
            arr.add(N);
            return arr;
        }
        return helper(false, N, arr);
    }
    
    public List<Integer> helper(boolean bool, int N, List<Integer> arr){
        if(bool){
            arr.add(N);
            if(N==arr.get(0)){
                return arr;
            }
            N = N+5;
            return helper(bool, N, arr);
        }
        else{
            arr.add(N);
            N = N-5;
            if(N<=0){
                bool = true;
            }
            return helper(bool, N, arr);
        }
    
}

    }

