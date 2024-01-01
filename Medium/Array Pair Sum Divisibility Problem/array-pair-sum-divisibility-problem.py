#User function Template for python3
class Solution:
    def canPair(self, nuns, k):
        # Code here
        
        if(n%2):
            
            return False
            
        d = {}
        
        ans = 0
            
        for j in range(len(nums)):
            
            temp = nums[j]%k
            
            if(temp):
                
                if(d.get(k-temp,0) == 0):
                    
                    d[temp] = 1
                    ans+=1
                    
                else:
                    
                    d[k-temp ]-=1
                    ans-=1 
                    
        if(ans==0):
            
            return True
        else:
            
            return False

# //PYTHON 
# //POTD SOLUTION(GFG)
# // 1 Jan 2024
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n, k = input().split()
		n = int(n)
		k = int(k)
		nums = list(map(int, input().split()))
		ob = Solution()
		ans = ob.canPair(nums, k)
		if(ans):
			print("True")
		else:
			print("False")
# } Driver Code Ends