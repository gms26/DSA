// Last updated: 5/25/2026, 11:05:09 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int s[]=new int[nums.length];
        s[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            s[i]=s[i-1]+nums[i];
        }
        int c=-1;
        if(nums.length==1)return 0;
        for(int i=0;i<nums.length;i++){int m=0,n=0;
        if(i==0){
            m=0;
            n=s[nums.length-1]-s[i];
        }else{
             m=s[i-1];n=s[nums.length-1]-s[i];}
            if(m==n){
                return i;
            }
        }
        return c;
    }
}