// Last updated: 9/28/2026, 10:25:39 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] q) {
        int n=nums.length;
        int a[]=new int[nums.length];
        int st,en,c=0;
        for(int i=0;i<q.length;i++){
            st=q[i][0];
            en=q[i][1];
            a[st]-=1;
            if(q[i][1]<n-1){
                a[q[i][1]+1]+=1;
            }
        }
        for(int i=0;i<n;i++){
            c+=a[i];
            if(nums[i]+c>0)return false;
        }
        return true;
    }
}