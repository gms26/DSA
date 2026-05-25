// Last updated: 5/25/2026, 11:05:51 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int c=0;
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if (i==j)
                {
                    c+=mat[i][j];
                }
                if((i+j)==(mat.length-1) && (i!=j))
                {
                    c+=mat[i][j];
                }        
               }
        }return c;
        
    }
}