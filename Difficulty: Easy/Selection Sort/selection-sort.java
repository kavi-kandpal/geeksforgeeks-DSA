//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{

	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++){
	     
	      int min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[min]>arr[j]){
	             min=j;
	            
	            }
	        }
                int temp=arr[i];
	             arr[i]=arr[min];
	              arr[min]=temp;
	    }
	    
	}
}