// Last updated: 5/25/2026, 11:12:38 AM
class Solution {
    public void setZeroes(int[][] m) {
        int[][] a = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                a[i][j] = m[i][j];

            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    for (int k = 0; k < m.length; k++) {
                        a[k][j] = 0;
                    }
                    for (int k = 0; k < m[0].length; k++) {
                        a[i][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = a[i][j];

            }
        }
    }
}