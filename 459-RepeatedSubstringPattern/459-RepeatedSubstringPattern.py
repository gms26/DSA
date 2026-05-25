# Last updated: 5/25/2026, 11:09:24 AM
class Solution(object):
    def repeatedSubstringPattern(self, s):
        d=s+s
        m=d[1:-1]
        return s in m