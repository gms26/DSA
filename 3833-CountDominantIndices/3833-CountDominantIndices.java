// Last updated: 9/28/2026, 10:23:54 PM
class Solution {
    public int dominantIndices(int[] nums) {
        int[]p=new int [nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        int c=0,n=nums.length;
        for(int i=0;i<n-1;i++){
            int s=p[n-1]-p[i];
            if(nums[i]*(n-1-i)>s){
                c++;
            }
        }
        
        return c;
    }
}