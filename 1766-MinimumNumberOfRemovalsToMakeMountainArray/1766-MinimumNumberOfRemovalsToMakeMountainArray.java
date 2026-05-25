// Last updated: 5/25/2026, 11:05:45 AM
class Solution {
    public int minimumMountainRemovals(int[] nums) {
       int lis[]=new int[nums.length];
       int[] lds=new int[nums.length];
       Arrays.fill(lis,1);
       Arrays.fill(lds,1);
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                lis[i]=Math.max(lis[i],lis[j]+1);
            }


        }
       }
       for(int i=nums.length-1;i>=0;i--){
        for(int j=nums.length-1;j>i;j--){
            if(nums[j]<nums[i]){
                lds[i]=Math.max(lds[i],lds[j]+1);
            }
        }
       }
       int m=0;
       for(int i=1;i<nums.length-1;i++){
        if(lis[i]>1 && lds[i]>1){
            m=Math.max(m,lis[i]+lds[i]-1);
        }
       }
       return nums.length-m;
    }
}