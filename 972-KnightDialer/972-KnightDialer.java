// Last updated: 5/25/2026, 11:07:41 AM
class Solution {
    int mod=1000000007;
    public int knightDialer(int n) {
        int [][]jump={
            {4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}
        };
        long dp[]=new long[10];
        Arrays.fill(dp,1);
        for(int a=2;a<=n;a++){
            long next[]=new long[10];
            for(int i=0;i<10;i++){
                for(int j:jump[i]){
                    next[j]=(next[j]+dp[i])%mod;
                }
            }
            dp=next;
        }
        long z=0;
        for(long c:dp){
            z=(z+c)%mod;
                    }
    return (int)z;
    }
}