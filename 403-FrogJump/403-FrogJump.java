// Last updated: 6/1/2026, 5:52:33 PM
1class Solution {
2    public boolean canCross(int[] stones) {
3        int n=stones.length;
4        boolean[][]dp=new boolean[n][n+1];
5        dp[0][0]=true;
6        for(int i=1;i<n;i++){
7            for(int j=0;j<i;j++){
8                int jump=stones[i]-stones[j];
9                if(jump>n)continue;
10                if(dp[j][jump]||(jump>0 && dp[j][jump-1])||(jump<n &&dp[j][jump+1])){
11                    dp[i][jump]=true;
12                
13             if(i==n-1)return true;
14               }
15            }
16        }
17        return dp[n-1][n-1];
18    }
19}