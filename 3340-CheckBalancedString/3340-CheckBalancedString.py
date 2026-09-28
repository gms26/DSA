# Last updated: 9/28/2026, 10:25:44 PM
class Solution(object):
    def isBalanced(self, n):
        a=0
        b=0
        for i,v in enumerate(n):
            if i%2==0:
                a+=int(v)
            else:
                b+=int(v)
        return a==b
        