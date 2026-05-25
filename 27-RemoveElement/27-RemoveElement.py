# Last updated: 5/25/2026, 11:13:27 AM
class Solution(object):
    def removeElement(self, nums, val):
        c=0
        for i in nums:
            if i!=val:
                nums[c]=i
                c+=1
            

      
        return c
