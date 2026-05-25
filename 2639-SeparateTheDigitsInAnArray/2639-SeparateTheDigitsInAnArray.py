# Last updated: 5/25/2026, 11:04:09 AM
class Solution(object):
    def separateDigits(self, n):
        a=[]
        for i in n:
            b=len(str(i))
            i=str(i)
            for j in range(b):
                a.append(int(i[j]))
        return a