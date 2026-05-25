# Last updated: 5/25/2026, 11:10:03 AM
class Solution(object):
    def intersection(self, n1, n2):
        a=set(n1)
        b=set(n2)
        return list(a.intersection(b))
        