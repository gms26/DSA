// Last updated: 5/25/2026, 11:10:43 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]l=new int[nums.length];
        l[0]=1;
         int[]r=new int[nums.length];
         r[nums.length-1]=1;
       
        int j=1,i=nums.length-2;
        while(j<nums.length && i>=0){
            
            l[j]=l[j-1]*nums[j-1];
            j++;
            r[i]=r[i+1]*nums[i+1];
            i--;
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=l[k]*r[k];
        }
        
        return nums;
    }
}