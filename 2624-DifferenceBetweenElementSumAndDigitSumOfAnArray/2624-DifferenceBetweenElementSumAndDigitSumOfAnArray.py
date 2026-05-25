# Last updated: 5/25/2026, 11:04:11 AM
class Solution(object):
    def differenceOfSum(self, n):
        a=0
        b=0
        for i in n:
            a+=i   
            t=i
            
            while t>0:
                b+=t%10
                t/=10

        return a-b