# Last updated: 5/25/2026, 11:08:58 AM
class Solution(object):
    def reverseWords(self, s):
        s=s.split()
        for i in range(len(s)):
            s[i]= s[i][::-1]
        return (' '.join(s))
        