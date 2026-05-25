# Last updated: 5/25/2026, 11:05:44 AM
class Solution(object):
    
    def arrayStringsAreEqual(self, w1, w2):
        n1=''
        n2=''
        for i in w1:
            n1+=i
        for i in w2:
            n2+=i
        return n1==n2
        