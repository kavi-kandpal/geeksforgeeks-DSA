#User function Template for python3

class Solution:
    def countWays(self, n, k):
        if n == 0:
            return 0
        elif n == 1:
            return k

        dp = [0] * (n + 1)
        mod = 1000000007
        dp[1] = k
        dp[2] = k * k
        for i in range(3, n + 1):
            same_color = (k - 1) * dp[i - 1]
            diff_color = (k - 1) * dp[i - 2]
            dp[i] = (same_color + diff_color) % mod
        return dp[n]

# //PYTHON 
# //POTD SOLUTION(GFG)
# // 14 December 2023


#{ 
 # Driver Code Starts

#Initial Template for Python 3




t=int(input())
for _ in range(0,t):
    x=list(map(int,input().split()))
    n=x[0]
    k=x[1]
    ob = Solution()
    ans=ob.countWays(n,k)
    print(ans)

# } Driver Code Ends