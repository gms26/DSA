// Last updated: 5/25/2026, 11:07:11 AM
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] b = new int[n];
        int c = 0;

        for (int i = 0; i < n && c < n; i++) {
            if (arr[i] == 0) {
                b[c++] = 0;
                if (c < n) b[c++] = 0;
            } else {
                b[c++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = b[i];
        }
    }
}
