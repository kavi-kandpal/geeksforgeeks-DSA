

from typing import List
class Solution:
    def buyMaximumProducts(self, n : int, k : int, price : List[int]) -> int:
        stocks = [(price[i], i + 1) for i in range(n)]
        stocks.sort()  
    
        max_stocks = 0
        remaining_amount = k
    
        for stock_price, day in stocks:
            max_stocks_possible = min(day, remaining_amount // stock_price)
            max_stocks += max_stocks_possible
            remaining_amount -= max_stocks_possible * stock_price
    
        return max_stocks

#python


#{ 
 # Driver Code Starts


class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n,k = map(int,input().strip().split())
        
        price=IntArray().Input(n)
        
        obj = Solution()
        res = obj.buyMaximumProducts(n, k, price)
        
        print(res)
        

# } Driver Code Ends