// Last updated: 5/25/2026, 11:03:09 AM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total=0;
        for(int []i:grid){
            for(int v:i){
                total+=v;
            }
        }
        if(total%2!=0)return false;
        long c=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length;j++){
                c+=grid[i][j];
            }
            if(c*2==total){
                return true;
            }
        }
        c=0;
        for(int j=0;j<grid[0].length-1;j++){
            for(int i=0;i<grid.length;i++){
                c+=grid[i][j];
            }
            if(c*2==total){
                return true;
            }
        }
        return false;
    }
}