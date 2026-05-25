// Last updated: 5/25/2026, 11:04:44 AM
class Solution {
    public int minimumAverageDifference(int[] nums) {
        long minval=Long.MAX_VALUE;
        int ind=0;
        long[]pre=new long[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            long f=pre[i]/(i+1);
            long s=0;
            if(i!=nums.length-1)s=(pre[nums.length-1]-pre[i])/(nums.length-i-1);
            long t=Math.abs(f-s);
            if(minval>t){
                minval=t;
                ind=i;
            }
        }
        return ind;
    }
}