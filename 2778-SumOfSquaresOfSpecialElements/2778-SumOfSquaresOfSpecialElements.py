# Last updated: 9/28/2026, 10:27:19 PM
class Solution(object):
    def sumOfSquares(self, nums):
        n = len(nums)
        total_sum = 0
        for i, num in enumerate(nums):
            if n % (i + 1) == 0:
                total_sum += num * num
        return total_sum
        