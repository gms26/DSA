// Last updated: 9/28/2026, 10:27:54 PM
class Solution {
    public long maxStrength(int[] nums) {
        int negCount = 0;
        int zeroCount = 0;
        long product = 1;
        int largestNegative = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }

            product *= num;

            if (num < 0) {
                negCount++;
                largestNegative = Math.max(largestNegative, num);
            }
        }

        // All zeros
        if (zeroCount == nums.length)
            return 0;

        // If exactly one non-zero element and it's negative
        if (nums.length - zeroCount == 1 && negCount == 1)
            return zeroCount > 0 ? 0 : product;

        // If product is negative, remove weakest negative
        if (product < 0)
            product /= largestNegative;

        return product;
    }
}