# Last updated: 5/25/2026, 11:09:44 AM
class Solution(object):
    def thirdMax(self, nums):
        
        nums=sorted(set(nums),reverse=True)
        return nums[0] if len(nums)<3 else nums[2]
        