# Last updated: 5/25/2026, 11:05:36 AM
class Solution(object):
    def sumOfUnique(self, n):
        
        c=Counter(n)
        a=0
        for i in c:
            if c[i]==1:
                a+=i
        return a