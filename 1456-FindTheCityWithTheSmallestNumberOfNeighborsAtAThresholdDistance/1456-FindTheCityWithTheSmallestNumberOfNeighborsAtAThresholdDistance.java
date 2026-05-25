// Last updated: 5/25/2026, 11:06:29 AM
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int mat[][]=new int[n][n];
        for (int[] row : mat ) {
            Arrays.fill(row, 1000000000);
        }
        
        for(int i=0;i<n;i++){
            mat[i][i]=0;
        }
        for(int[]i:edges){
            int a=i[0];
            int b=i[1];
            int c=i[2];
            mat[a][b]=c;
            mat[b][a]=c;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                }
            }
        }
         
        int minCities = Integer.MAX_VALUE;
        int ans = n - 1;
        
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] <= distanceThreshold) {
                    count++;
                }
            }
            
            if (count < minCities) {
                minCities = count;
                ans = i;
            }
        }
        
        return ans;
    }
}