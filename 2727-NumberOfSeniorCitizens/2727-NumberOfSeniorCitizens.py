# Last updated: 5/25/2026, 11:04:00 AM
class Solution(object):
    def countSeniors(self, d):
        b=[]
        c=0
        for i in d:
            a=int(i[11]+i[12])
            b.append(a)
        for i in b:
            if i>60:
                c+=1
        return c