// Last updated: 6/2/2026, 9:30:40 AM
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return n>>1 == 1<<n;
    }
}