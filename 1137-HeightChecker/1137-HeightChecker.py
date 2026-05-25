# Last updated: 5/25/2026, 11:07:13 AM
class Solution(object):
    def heightChecker(self, h):
        a=sorted(h)
        c=0
        for i in range(len(h)):
            if a[i]!=h[i]:
                c+=1
        return c
        