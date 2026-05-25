# Last updated: 5/25/2026, 11:13:47 AM
class Solution(object):
    def isPalindrome(self, x):
        x=str(x)
        self=x[::-1]
        if x==self:
            return True
        else:
            return False

        