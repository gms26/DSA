# Last updated: 5/25/2026, 11:11:37 AM
class Solution(object):
    def reverseWords(self, s):
        w=s.split()
        w.reverse()
        return ' '.join(w)