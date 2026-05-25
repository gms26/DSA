// Last updated: 5/25/2026, 11:10:16 AM
class Solution {
    int dp[][];
    int[] arr;
    public int maxCoins(int[] nums) {
        int n=nums.length;
        arr=new int[n+2];
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        dp=new int[n+2][n+2];
        return solve(0,n+1);
    }
    public int solve(int left,int right){
        if(left+1==right)return 0;
        if(dp[left][right]!=0)return dp[left][right];
        int max=0;
        for(int i=left+1;i<right;i++){
            int c=solve(left,i)+solve(i,right)+arr[left]*arr[i]*arr[right];
            max=Math.max(c,max);
        }
        return dp[left][right]=max;
    }
}