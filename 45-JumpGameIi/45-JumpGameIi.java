// Last updated: 5/25/2026, 11:13:10 AM
class Solution {
    public int jump(int[] nums) {
        int j=0,e=0,f=0;
        for(int i=0;i<nums.length-1;i++){
            f=Math.max(f,i+nums[i]);
            if(i==e){j++;
            e=f;}
        }
        return j;
    }
}