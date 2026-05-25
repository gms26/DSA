# Last updated: 5/25/2026, 11:07:48 AM
class Solution(object):
    def reverseOnlyLetters(self, s):
       l=[]
       for c in s:
        if c.isalpha():
            l.append(c)
       l.reverse()
       r=[]
       i=0
       for c in s:
        if c.isalpha():
            r.append(l[i])
            i+=1
        else:
            r.append(c)
        res=''.join(r)
       return res