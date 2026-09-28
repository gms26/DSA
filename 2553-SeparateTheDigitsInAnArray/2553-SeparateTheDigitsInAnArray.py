# Last updated: 9/28/2026, 10:28:25 PM
class Solution(object):
    def separateDigits(self, n):
        a=[]
        for i in n:
            b=len(str(i))
            i=str(i)
            for j in range(b):
                a.append(int(i[j]))
        return a