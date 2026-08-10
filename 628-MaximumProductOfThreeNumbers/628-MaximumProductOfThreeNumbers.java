// Last updated: 8/10/2026, 12:21:25 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int f=nums[a-1]*nums[a-2]*nums[a-3];
        int b=nums[0]*nums[1]*nums[a-1];
        return Math.max(f,b);
    }
}