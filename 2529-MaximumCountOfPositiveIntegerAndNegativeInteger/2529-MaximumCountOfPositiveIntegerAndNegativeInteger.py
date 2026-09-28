# Last updated: 9/28/2026, 10:28:37 PM
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

        