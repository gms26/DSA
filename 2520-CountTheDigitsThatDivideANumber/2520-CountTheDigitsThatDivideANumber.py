# Last updated: 9/28/2026, 10:28:41 PM
class Solution(object):
    def countDigits(self, n):
        c=0
        a=str(n)       
        for i in a:
            b=int(i)
            if b!=0 and n%b==0:
                c+=1
        return c