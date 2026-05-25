# Last updated: 5/25/2026, 11:04:13 AM
class Solution(object):
    def maximumCount(self, nums):
        a=0
    
        l=0
        for i in range(len(nums)):
            if nums[i]>0 and nums[i]!=0 :
                a+=1
            
            elif nums[i]<0 and nums[i]!=0:
                l+=1
        if a>l:
            return a
        else:
            return l

        