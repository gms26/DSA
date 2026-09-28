# Last updated: 9/28/2026, 10:27:30 PM
class Solution(object):
    def findNonMinOrMax(self, nums):
        return sorted(nums)[1] if len(nums) >= 3 else -1
        