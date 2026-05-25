// Last updated: 5/25/2026, 11:04:42 AM
class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long[]s=new long[nums.length];
        s[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            s[i]=s[i-1]+nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            long z=s[nums.length-1]-s[i];
            if(s[i]>=z)c++;
            
        }
        return c;
    }
}