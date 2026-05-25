// Last updated: 5/25/2026, 11:07:46 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int s=nums[0];
        int cn1=nums[0],cmin=nums[0];
        int min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            s+=nums[i];
            cn1=Math.max(cn1+nums[i],nums[i]);
            max=Math.max(max,cn1);
            cmin=Math.min(cmin+nums[i],nums[i]);
            min=Math.min(min,cmin);
        }
        if(max<0)return max;
        return Math.max(max,s-min);
    }
}