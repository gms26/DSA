// Last updated: 8/31/2026, 12:20:55 PM
class Solution {
    public int[] buildArray(int[] nums) {
     int []ar=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        ar[i]=nums[nums[i]];
     }   
     return ar;
    }
}