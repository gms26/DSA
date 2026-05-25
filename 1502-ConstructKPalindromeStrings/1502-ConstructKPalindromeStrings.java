// Last updated: 5/25/2026, 11:06:19 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        for (int f : freq) {
            if ((f & 1) == 1) odd++;
        }

        return odd <= k;
    }
}