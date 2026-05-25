# Last updated: 5/25/2026, 11:13:28 AM
class Solution(object):
    def removeDuplicates(self, nums):
        n=0
        c=set()
        for i in range(len(nums)):
            if nums[i] not in c:
                c.add(nums[i])
                nums[n]=nums[i]
                n+=1
        return n