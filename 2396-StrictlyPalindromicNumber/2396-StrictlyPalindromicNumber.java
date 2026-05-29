// Last updated: 5/29/2026, 12:10:36 PM
1class Solution {
2    public boolean isStrictlyPalindromic(int n) {
3        return n>>1 == 1<<n;
4    }
5}