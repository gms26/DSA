# Last updated: 5/25/2026, 11:08:40 AM
class Solution(object):
    def calPoints(self, o):
        a=[]
        for i in o:
            
                if i=="C":
                    a.pop()
                elif i=="D":
                    c=a[-1]*2
                    a.append(c)
                elif i=="+":
                    d=a[-1]+a[-2]
                    a.append(d)
                else:
                    a.append(int(i))
        return sum(a)