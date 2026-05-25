// Last updated: 5/25/2026, 11:07:52 AM
class Solution {
    public boolean isMonotonic(int[] n) {
        boolean a = true;
        boolean b = true;
        for (int i = 1; i < n.length; i++) {
            if (n[i] > n[i - 1]) {
                b = false;
            }

            if (n[i] < n[i - 1]) {
                a = false;
            }
        }
        return a || b;
    }
}