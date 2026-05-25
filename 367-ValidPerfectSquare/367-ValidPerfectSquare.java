// Last updated: 5/25/2026, 11:09:58 AM
class Solution {
    public boolean isPerfectSquare(int n) {
         if (n < 2) return true; // 0 and 1 are perfect squares

        long left = 2, right = n / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}