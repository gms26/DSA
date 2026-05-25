// Last updated: 5/25/2026, 11:04:03 AM
class Solution {
    public int diagonalPrime(int[][] n) {
        int maxPrime = 0;
        int len = n.length;

        for (int i = 0; i < len; i++) {
            if (isPrime(n[i][i])) {
                maxPrime = Math.max(maxPrime, n[i][i]);
            }
            if (isPrime(n[i][len - 1 - i])) {
                maxPrime = Math.max(maxPrime, n[i][len - 1 - i]);
            }
        }

        return maxPrime;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
