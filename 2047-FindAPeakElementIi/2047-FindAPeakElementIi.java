// Last updated: 8/31/2026, 12:20:57 PM
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        //int[]ar=new int[2];
        int  m=mat.length,n=mat[0].length;
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                boolean peak=true;
                if (i > 0 && mat[i][j] <= mat[i - 1][j]) {
                    peak = false;
                }

            
                if (i < m - 1 && mat[i][j] <= mat[i + 1][j]) {
                    peak = false;
                }

                
                if (j > 0 && mat[i][j] <= mat[i][j - 1]) {
                    peak = false;
                }

                
                if (j < n - 1 && mat[i][j] <= mat[i][j + 1]) {
                    peak = false;
                }
if (peak) {
                    return new int[]{i, j};
                }
                
        }
        
    }return new int[]{-1,-1};
}}