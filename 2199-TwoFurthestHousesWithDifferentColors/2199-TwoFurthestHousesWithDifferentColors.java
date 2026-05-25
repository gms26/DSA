// Last updated: 5/25/2026, 11:04:55 AM
class Solution {
    public int maxDistance(int[] nums) {
      
       int c=0;
       for(int i=0;i<nums.length;i++){
        for(int j=nums.length-1;j>=0;j--){
        if(nums[i]!=nums[j]){
            c=Math.max(c,Math.abs(i-j));
        }
        }}
       
       return c;
    }
}