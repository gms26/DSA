// Last updated: 5/25/2026, 11:04:59 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int c=-1,min=nums[0];
        for(int i=1;i<nums.length;i++){
           if(min<nums[i]){
            c=Math.max(c,nums[i]-min);}
            else{
                min=nums[i];
            }
        }
        
        return c;
    }
}