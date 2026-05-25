# Last updated: 5/25/2026, 11:12:35 AM
class Solution(object):
    def sortColors(self, n):
        z=0
        o=0
        s=len(n)-1
        while o<=s:
            if n[o]==0:
                n[z],n[o]=n[o],n[z]
                z+=1
                o+=1
            elif n[o]==1:
                o+=1
            else:
                n[o],n[s]=n[s],n[o]
                s-=1
        
        return n
        