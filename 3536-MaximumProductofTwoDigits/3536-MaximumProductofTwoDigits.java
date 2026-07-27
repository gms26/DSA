// Last updated: 7/27/2026, 11:42:44 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums.length;
5        int f=nums[a-1]*nums[a-2]*nums[a-3];
6        int b=nums[0]*nums[1]*nums[a-1];
7        return Math.max(f,b);
8    }
9}