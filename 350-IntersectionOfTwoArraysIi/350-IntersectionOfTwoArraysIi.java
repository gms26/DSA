// Last updated: 5/25/2026, 11:10:02 AM
class Solution {
    public int[] intersect(int[] n1, int[] n2) {
        int[] b = new int[Math.min(n1.length, n2.length)];
        int k = 0;

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if (n1[i] == n2[j]) {
                    b[k++] = n1[i];
                    n2[j] = Integer.MIN_VALUE; 
                    break;
                }
            }
        }

        
        int[] m = new int[k];
        for (int i = 0; i < k; i++) {
            m[i] = b[i];
        }

        return m;
    }
}