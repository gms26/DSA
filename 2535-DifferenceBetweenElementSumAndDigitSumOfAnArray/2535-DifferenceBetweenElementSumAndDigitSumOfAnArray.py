# Last updated: 9/28/2026, 10:28:30 PM
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