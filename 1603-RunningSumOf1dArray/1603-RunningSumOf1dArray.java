// Last updated: 5/25/2026, 11:06:03 AM
class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}