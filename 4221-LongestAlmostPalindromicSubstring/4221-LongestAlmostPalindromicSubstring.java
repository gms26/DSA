// Last updated: 5/25/2026, 11:02:59 AM
class Solution {
    public int almostPalindromic(String s) {
        int n = s.length();
        if (n < 2) return 0;

        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = (len == 2) ? 0 : dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;

                // dp==1 means exactly one deletion needed
                // dp==0 means already palindrome (still valid if len>=2)
                if (dp[i][j] <= 1) {
                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
    }
}
