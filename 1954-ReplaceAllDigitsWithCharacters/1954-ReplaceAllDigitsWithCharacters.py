# Last updated: 5/25/2026, 11:05:24 AM
class Solution(object):
    def replaceDigits(self, s):
        a=''
        
        for i in range(len(s)):
            if s[i].isdigit():
                b = int(s[i])          # digit value
                c = ord(s[i-1])        # ASCII of previous char
                c = chr(c + b)         # shift previous char by digit value
                a += c
            else:
                a += s[i]
        return a