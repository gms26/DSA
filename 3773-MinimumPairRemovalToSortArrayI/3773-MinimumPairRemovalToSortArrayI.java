// Last updated: 5/25/2026, 11:03:12 AM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int c=0;
        while(!issort(nums)){
            int n=nums.length;
            int ind=-1;
            int minSum = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
            int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    ind = i;
                }
        }
        int [] ar=new int[n-1];
        int k=0;
        for(int i=0;i<n;i++){
            if(i==ind){
               ar[k++]=nums[i]+nums[i+1];
               i++;
            }
            else{
                ar[k++]=nums[i];
            }
        }
        nums=ar;
        c++;}
        return c;

       
    }
    public boolean issort(int[] nums){
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        
        return true;
    }
}