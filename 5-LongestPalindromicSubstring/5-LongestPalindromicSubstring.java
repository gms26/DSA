// Last updated: 5/25/2026, 11:13:50 AM
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        // length = 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // initialize result
        String r = s.substring(0, 1);

        // length = 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                r = s.substring(i, i + 2);
                maxLen = 2;
            }
        }

        
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLen) {
                        maxLen = len;
                        r = s.substring(i, j + 1);
                    }
                }
            }
        }

        return r;
    }
}
