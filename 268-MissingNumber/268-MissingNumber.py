# Last updated: 5/25/2026, 11:10:36 AM
class Solution(object):
    def missingNumber(self, n):
        a=-1
        for i in range(len(n)):
            if i not in n:
                a=i
        if a==-1:
            return max(n)+1
        else:
            return a