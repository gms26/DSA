# Last updated: 5/25/2026, 11:04:15 AM
class Solution(object):
    def countDigits(self, n):
        c=0
        a=str(n)       
        for i in a:
            b=int(i)
            if b!=0 and n%b==0:
                c+=1
        return c