// Last updated: 8/10/2026, 12:18:32 PM
class Solution {

public int shortestPathBinaryMatrix(int[][] grid){
int n=grid.length;
if(grid[0][0]==1 || grid[n-1][n-1]==1)return -1;

int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
Queue<int[]>q=new LinkedList<>();
q.offer(new int[]{0,0,1});
grid[0][0]=1;
while(!q.isEmpty()){
    int[]cur=q.poll();
    int r=cur[0];
    int c=cur[1];
    int dist=cur[2];
    if(r==n-1 && c==n-1)return dist;
    for(int[]i:dir){
        int nr=r+i[0];
        int nc=c+i[1];
        if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0){
grid[nr][nc]=1;
q.offer(new int[]{nr,nc,dist+1});
        }
    }
}
return -1;




































    // int c=Integer.MAX_VALUE;    tle
    // void bt(int[][]grid,int n,int i,int j,int st){
    //     if(i<0 || j<0 || i>=n||j>=n || grid[i][j]==1)return;
    //     if(i==n-1 && j==n-1){c=Math.min(c,st+1);return;}
    //     grid[i][j]=1;
    //     bt(grid,n,i+1,j,st+1);
    //     bt(grid,n,i,j+1,st+1);
    //     bt(grid,n,i-1,j,st+1);
    //     bt(grid,n,i,j-1,st+1);
    //     bt(grid,n,i+1,j+1,st+1);
    //     bt(grid,n,i-1,j-1,st+1);
    //     bt(grid,n,i-1,j+1,st+1);
    //     bt(grid,n,i+1,j-1,st+1);
    //     grid[i][j]=0;
    // }
    // public int shortestPathBinaryMatrix(int[][] grid) {
    //     bt(grid,grid.length,0,0,0);
    //     return c==Integer.MAX_VALUE?-1:c;
    }
}