// Last updated: 5/25/2026, 11:09:16 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0, j = 0, c = 0;
        boolean z = true;
        int[] a = new int[mat.length * mat[0].length];
        while (c< mat.length * mat[0].length) {
            a[c++] = mat[i][j];
            if (z==true) {
                i--;
                j++;
                if (j >= mat[0].length) {
                    i += 2;
                    j--;
                    z = false;
                } else if (i < 0) {
                    i++;
                    z = false;
                }
            }
            else{
                i++;j--;
                if(i>=mat.length){
                    j+=2;
                    i--;
                    z=true;
                }
                else if(j<0){
                    j++;
                    z=true;
                }
            }
        }
        return a;
    }
}