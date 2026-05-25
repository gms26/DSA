// Last updated: 5/25/2026, 11:08:01 AM
class Solution {
    public int[][] transpose(int[][] mat) {
        int [][]res=new int[mat[0].length][mat.length];
         int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = mat[i][j];
            }
        }return res;
    }
}