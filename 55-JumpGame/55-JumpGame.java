// Last updated: 5/25/2026, 11:12:56 AM
class Solution {
    public boolean canJump(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++){
            
            if(i>f){
                return false;
            }
            f=Math.max(f,i+nums[i]);
            
        }
        
        return true;
    }
}