# Last updated: 5/25/2026, 11:06:36 AM
class Solution(object):
    def findNumbers(self, n):
        c=0
        for i in n:
            if len(str(i))%2==0:
                c+=1
        return c

        