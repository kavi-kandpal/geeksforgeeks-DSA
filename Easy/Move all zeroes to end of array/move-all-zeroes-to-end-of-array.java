//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
       if(arr.length == 0 || arr.length == 1) {
            return;
        }
        
        int nz = 0; // Pointer to the next non-zero element
        int nq = 0; // Pointer to the next position to place a non-zero element
        
        while(nz < arr.length) {
            if(arr[nz] != 0) {
                // Swap non-zero element with the next available position
                int temp = arr[nz];
                arr[nz] = arr[nq];
                arr[nq] = temp;
                nq++;
            }
            nz++;
        }   
       
    }
}
