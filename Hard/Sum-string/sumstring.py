#User function Template for python3 
class Solution: 
    def isSumString (ob,S): 
        # code here  
        def ok(s1,s2,s): 
            if s=='': 
                return True 
            s3=str(int(s1)+int(s2)) 
            n=len(s3) 
            if s[:n]==s3: 
                return ok(s2,s3,s[n:]) 
            return False 
        n=len(S) 
        for i in range(1,n-2): 
            for j in range(i+1,n-1): 
                s1,s2=S[:i],S[i:j] 
                if ok(s1,s2,S[j:]): 
                    return 1 
        return 0


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=str(input())

        ob = Solution()
        
        print(ob.isSumString(S))
# } Driver Code Ends