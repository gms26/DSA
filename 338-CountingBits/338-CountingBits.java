// Last updated: 5/25/2026, 11:10:10 AM
class Solution {
    public int[] countBits(int n) {
        int [] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}