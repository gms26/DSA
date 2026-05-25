# Last updated: 5/25/2026, 11:10:06 AM
class Solution(object):
    def reverseVowels(self, s):
        
        q="aeiouAEIOU"
        l,r=0,len(s)-1
        c=list(s)
        while l<r:
            while l<r and c[l]not in q:
                l+=1
            while l<r and c[r]not in q:
                r-=1
            
            c[l],c[r]=c[r],c[l]
            l+=1
            r-=1
        return "".join(c)