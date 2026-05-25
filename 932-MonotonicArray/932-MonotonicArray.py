# Last updated: 5/25/2026, 11:07:58 AM
class Solution(object):
    def isMonotonic(self, n):
        a=sorted(n)
        b=sorted(n,reverse=True)
        return (a==n or b==n)
            