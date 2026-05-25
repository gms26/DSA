# Last updated: 5/25/2026, 11:09:19 AM
class Solution(object):
    def findMaxConsecutiveOnes(self, n):
        c=0
        s=0
        for i in n:
            if i==1:
                c+=1
                
            else:
                if(c>s):
                    s=c
                c=0
        if s>c:
            return s
        else:
            return c
        