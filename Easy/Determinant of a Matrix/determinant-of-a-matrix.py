
#User function Template for python3
class Solution:
    
    #Function for finding determinant of matrix.
    def determinantOfMatrix(self,matrix,n):
        def compute(row, col_s):
            nonlocal n 
            if row == n:
                return 1
            sign = 1
            ret = 0
            for c in range(n):
                if c not in col_s:
                    col_s.add(c)
                    ret += sign*matrix[row][c]*compute(row+1, col_s)
                    col_s.remove(c)
                    sign *= -1
            return ret
        return compute(0, set())



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        values = list(map(int, input().strip().split()))
        k = 0
        matrix =[]
        for i in range(n):
            row=[]
            for j in range(n):
                row.append(values[k])
                k+=1
            matrix.append(row)
        obj = Solution()
        print(obj.determinantOfMatrix(matrix,n))
# } Driver Code Ends