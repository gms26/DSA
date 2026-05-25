// Last updated: 5/25/2026, 11:10:30 AM
class Solution {
    public int missingNumber(int[] nums) {
        int t=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int a=max*(max+1)/2;
        if(min!=0)return 0;
        if(a-t==0)return max+1;
        return a-t;
    }
}