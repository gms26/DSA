// Last updated: 8/10/2026, 12:19:35 PM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[]ma=new int[n];
        ma[0]=nums[0];
        int[]mi=new int[n];
        mi[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            ma[i]=Math.max(ma[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            mi[i]=Math.min(mi[i+1],nums[i]);
        }
        for(int i=1;i<n;i++){
            if(ma[i-1]<=mi[i]) return i;
            
        }
        return 0;
    }
}