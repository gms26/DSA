// Last updated: 5/25/2026, 11:12:59 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
         int m=nums[0];
         for(int i=1;i<nums.length;i++){
            a=Math.max(a+nums[i],nums[i]);
            m=Math.max(m,a);
         }
         return m;
    }
}