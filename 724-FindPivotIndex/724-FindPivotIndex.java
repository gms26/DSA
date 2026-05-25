// Last updated: 5/25/2026, 11:08:35 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int[] p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int l,r;
            if(i==0){
                l=0;
                r=p[nums.length-1]-nums[i];
            }
            else{
                l=p[i-1];
                r=p[nums.length-1]-p[i];
            }
            if(l==r)return i;
        }
        return -1;
    }
}