// Last updated: 8/10/2026, 9:59:36 PM
1class Solution {
2    public int[] buildArray(int[] nums) {
3     int []ar=new int[nums.length];
4     for(int i=0;i<nums.length;i++){
5        ar[i]=nums[nums[i]];
6     }   
7     return ar;
8    }
9}