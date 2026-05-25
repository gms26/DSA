# Last updated: 5/25/2026, 11:03:16 AM
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
        