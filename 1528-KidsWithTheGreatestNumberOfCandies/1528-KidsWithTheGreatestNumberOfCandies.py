# Last updated: 5/25/2026, 11:06:18 AM
class Solution(object):
    def kidsWithCandies(self, c, e):
        
        d=[]
        a=max(c)
        for i in range(len(c)):
            b=c[i]+e
            
            d.append(b>=a)
        return d
        