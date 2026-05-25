// Last updated: 5/25/2026, 11:03:36 AM
class Solution {
    public String triangleType(int[] n) {
        int a = n[0], b = n[1], c = n[2];

        // Check for valid triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || c == a) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
