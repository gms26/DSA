// Last updated: 5/25/2026, 11:05:16 AM
class Solution {
    int a=0;
    public int subsetXORSum(int[] nums) {
    //     find(nums,0,0);
    //     return a;
    // }
    // void find(int[] nums,int i,int xor){
    //     if(i==nums.length){
    //         a+=xor;
    //         return;
    //     }
    //     find(nums,i+1,xor^nums[i]);
    //     find(nums,i+1,xor);
        for(int i=0;i<nums.length;i++){
            a|=nums[i];
        }
        return a<<nums.length-1;
    }
}