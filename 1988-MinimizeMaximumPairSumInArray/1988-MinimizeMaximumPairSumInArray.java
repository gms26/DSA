// Last updated: 5/25/2026, 11:05:17 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int a=0;
        while(i<j){
            a=Math.max(a,nums[i]+nums[j]);
            i++;j--;
        }
        return a;
    }
}