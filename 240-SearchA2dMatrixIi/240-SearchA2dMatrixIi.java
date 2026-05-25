// Last updated: 5/25/2026, 11:10:40 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]>target)c--;
            else r++;
        }
        return false;
    }
}