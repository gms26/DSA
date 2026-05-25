// Last updated: 5/25/2026, 11:08:36 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      if (k <= 1) return 0;

        int prod = 1, left = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];

            while (prod >= k && left <= i) {
                prod /= nums[left];
                left++;
            }

            count += i - left + 1; 
        }

        return count;  
    }
}