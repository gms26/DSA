// Last updated: 8/10/2026, 12:18:58 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int m=0,l=0,r=0,z=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;

    }
}