# Last updated: 5/25/2026, 11:03:47 AM
class Solution(object):
    def sumOfSquares(self, nums):
        n = len(nums)
        total_sum = 0
        for i, num in enumerate(nums):
            if n % (i + 1) == 0:
                total_sum += num * num
        return total_sum
        