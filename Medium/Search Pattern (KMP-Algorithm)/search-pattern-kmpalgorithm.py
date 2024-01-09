#User function Template for python3

class Solution:
    def search(self, pat, txt):
        indices = []
        m, n = len(pat), len(txt)
        
        if m == 0 or n == 0 or m > n:
            return indices
        
        # Construct the prefix table for the pattern
        def compute_prefix(pattern):
            prefix = [0] * len(pattern)
            j = 0
            for i in range(1, len(pattern)):
                while j > 0 and pattern[i] != pattern[j]:
                    j = prefix[j - 1]
                if pattern[i] == pattern[j]:
                    j += 1
                prefix[i] = j
            return prefix
        
        # Compute the prefix table for the pattern
        prefix_table = compute_prefix(pat)
        
        # KMP pattern matching algorithm
        j = 0  # Index for pattern
        for i in range(n):
            while j > 0 and txt[i] != pat[j]:
                j = prefix_table[j - 1]
            if txt[i] == pat[j]:
                j += 1
            if j == m:  # Match found
                indices.append(i - m + 1 + 1)  # Index of the start of the match
                j = prefix_table[j - 1]

        return indices

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        patt = input().strip()
        ob = Solution()
        ans = ob.search(patt, s)
        if len(ans)==0:
            print(-1,end="")
        for value in ans:
            print(value,end = ' ')
        print()
# } Driver Code Ends