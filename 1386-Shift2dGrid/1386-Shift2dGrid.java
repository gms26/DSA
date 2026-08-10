// Last updated: 8/10/2026, 12:17:22 PM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int m) {
        List<List<Integer>>a=new ArrayList<>();
        int o=grid.length,p=grid[0].length;
        
        for(int i=0;i<m;i++){
        int[][]ar=new int[o][p];
            for(int j=0;j<grid.length;j++){
                for(int k=0;k<grid[0].length;k++){
                    
                    if(k<grid[0].length-1){
                        ar[j][k+1]=grid[j][k];
                    }
                    if(k==p-1 && j<grid.length-1){
                        ar[j+1][0]=grid[j][k];
                    }
                    if(j==o-1 && k==p-1){
                        ar[0][0]=grid[j][k];
                    }
                }
            }
            grid=ar;
        }
        for(int i=0;i<o;i++){
            ArrayList<Integer>z=new ArrayList<>();
            for(int j=0;j<p;j++){
                z.add(grid[i][j]);
            }
            a.add(z);
        }
        return a;
    }
}