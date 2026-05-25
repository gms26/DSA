// Last updated: 5/25/2026, 11:12:36 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int si=0,li=n*m-1;
        while(si<=li){
            int mid=(si+li)/2;
            int r=mid/m;
            int c=mid%m;   //time complexcity less
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]>target)li=mid-1;
            else si=mid+1;
        }
        return false;
    }
}