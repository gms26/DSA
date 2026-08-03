// Last updated: 8/3/2026, 2:29:01 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m=s.length();
4        int n=p.length();
5        boolean[][]dp=new boolean[n+1][m+1];
6        dp[0][0]=true;
7        for(int i=1;i<=p.length();i++){
8            if(p.charAt(i-1)=='*'){
9                dp[i][0]=dp[i-1][0];
10            }
11        }
12         for(int i=1;i<=p.length();i++){
13            for(int j=1;j<=s.length();j++){
14                if(p.charAt(i-1)==s.charAt(j-1)|| p.charAt(i-1)=='?'){
15                    dp[i][j]=dp[i-1][j-1];
16                }
17                else if(p.charAt(i-1)=='*'){
18                    if(dp[i-1][j]==true || dp[i][j-1]==true){
19                        dp[i][j]=true;
20                    }
21                }
22            }
23         }
24         return dp[n][m];
25    }
26}