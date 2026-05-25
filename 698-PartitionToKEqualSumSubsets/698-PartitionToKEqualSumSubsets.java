// Last updated: 5/25/2026, 11:08:37 AM
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int s=0;
        for(int i:nums)s+=i;
        int t=s/k;
        Arrays.sort(nums);
        int[]z=new int[k];
        return back(t,nums,nums.length-1,z);
    }
    boolean back(int t,int[]n,int ind,int []z){
        if(ind<0)return true;
        int val=n[ind];
        for(int i=0;i<z.length;i++){
            if(z[i]+val>t)continue;
            z[i]+=val;
            if(back(t,n,ind-1,z))return true;
            z[i]-=val;
            if(z[i]==0)break;
        }
        return false;
    }
}