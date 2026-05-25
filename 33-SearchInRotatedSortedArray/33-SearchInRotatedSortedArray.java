// Last updated: 5/25/2026, 11:13:20 AM
class Solution {
    public int search(int[] nums, int t) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(nums[m]==t)return m;
            if(nums[i]<=nums[m]){
                if(nums[i]<=t && nums[m]>=t){
                    j=m-1;
                }
                else{
                    i=m+1;
                }
            }
            else{
                if(nums[m]<=t && nums[j]>=t){
                    i=m+1;
                }
                else{
                    j=m-1;
                }
            }
        }
        return -1;
    }
}