# Last updated: 5/25/2026, 11:05:42 AM
class Solution(object):
    def maximumWealth(self, a):
        d=[]
        
        for i in a:
            b=0
            for j in range(len(i)):
                b+=i[j]
            d.append(b)
        return max(d)