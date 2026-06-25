// Last updated: 6/25/2026, 9:40:38 AM
1class Solution {
2    public int numRollsToTarget(int n, int k, int target) {
3        int mod=1000000007;
4        int[][]dp=new int[n+1][target+1];
5        dp[0][0]=1;
6        for(int i=1;i<=n;i++){
7            for(int j=1;j<=target;j++){
8                for(int m=1;m<=k;m++){
9                    if(j>=m){
10                        dp[i][j]=(dp[i][j]+dp[i-1][j-m])%mod;
11                    }
12                }
13            }
14        }
15        return dp[n][target];
16    }
17}