# Last updated: 5/25/2026, 11:03:49 AM
class Solution(object):
    def findNonMinOrMax(self, nums):
        return sorted(nums)[1] if len(nums) >= 3 else -1
        