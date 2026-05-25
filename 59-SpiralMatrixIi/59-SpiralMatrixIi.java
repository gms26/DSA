// Last updated: 5/25/2026, 11:12:53 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int v=1;
        int[][]m=new int[n][n];
	    for(int r=0;r<(n+1)/2;r++){
	        for(int c=r;c<n-r;c++){
	            m[r][c]=v++;
	        }//right
	        for(int c=r+1;c<n-r;c++){
	            m[c][n-r-1]=v++;
	        }//bottom
	        for(int c=n-r-2;c>=r;c--){
	            m[n-r-1][c]=v++;
	        }//left
	        for(int c=n-r-2;c>r;c--){
	            m[c][r]=v++;
	        }
	    }
	    
	   return m;
    }
}
