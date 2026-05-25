# Last updated: 5/25/2026, 11:09:38 AM
class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Step 1: Mark each visited index as negative
        for num in nums:
            index = abs(num) - 1
            nums[index] = -abs(nums[index])

        # Step 2: Collect indices which are still positive
        result = []
        for i in range(len(nums)):
            if nums[i] > 0:
                result.append(i + 1)

        return result
        