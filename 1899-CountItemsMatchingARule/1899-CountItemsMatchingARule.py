# Last updated: 5/25/2026, 11:05:31 AM
class Solution(object):
    def countMatches(self, i, r, r1):
        c=0
       
        for j in i:
            
                if r=="type":
                    if j[0]==r1:
                        c+=1
                elif r=="color":
                    if j[1]==r1:
                        c+=1
                elif r=="name":
                    if j[2]==r1:
                        c+=1
                    
        return c