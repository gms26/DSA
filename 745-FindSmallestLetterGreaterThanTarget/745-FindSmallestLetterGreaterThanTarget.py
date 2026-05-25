# Last updated: 5/25/2026, 11:08:26 AM
class Solution(object):
    def nextGreatestLetter(self, l, t):
      
        for i in l:
            if i>t:
                return i
        return l[0]
        