// Last updated: 5/25/2026, 11:07:04 AM
class Solution {
    public int[] replaceElements(int[] nums) {
        int[]r=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                c=Math.max(c,nums[j]);
            }
            if(c==0)r[i]=-1;
            else r[i]=c;
        }
        return r;
    }
}