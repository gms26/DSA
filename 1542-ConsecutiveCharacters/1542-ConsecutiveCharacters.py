# Last updated: 5/25/2026, 11:06:13 AM
class Solution(object):
    def maxPower(self, s):
        c=1
        a=1
        for i in range(1,len(s)):
           
                if s[i]==s[i-1]:
                    c+=1
                    a=max(c,a)
                else:
                    
                    c=1
        return a
        