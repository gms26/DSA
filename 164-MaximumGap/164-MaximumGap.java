// Last updated: 5/25/2026, 11:11:30 AM
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        int c=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int s=nums[i]-nums[i-1];
            if(c<s)c=s;
        }
        return c;
    }
}