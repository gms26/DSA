# Last updated: 5/25/2026, 11:07:50 AM
class Solution(object):
    def sortArrayByParity(self, n):
        a=[]
        b=[]
        for i in range(len(n)):
            if n[i]%2==0:
                a.append(n[i])
            else:
                b.append(n[i])
        return a+b
