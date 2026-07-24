// Last updated: 7/24/2026, 6:06:24 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int[]ar=new int[k];
        int ind=0;
        for(int i=nums.length-k;i<nums.length;i++){
            ar[ind++]=nums[i];
        }
        Arrays.sort(ar);

        long ans=0;
        int m=mul;
        for(int i=k-1;i>=0;i--){
            long n=ar[i];
            long x=1L*n*m;
            ans+=Math.max(x,n);
            m--;
        }
        return ans;
    }
}