// Last updated: 6/25/2026, 11:37:52 AM
1class Solution {
2
3public int shortestPathBinaryMatrix(int[][] grid){
4int n=grid.length;
5if(grid[0][0]==1 || grid[n-1][n-1]==1)return -1;
6
7int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
8Queue<int[]>q=new LinkedList<>();
9q.offer(new int[]{0,0,1});
10grid[0][0]=1;
11while(!q.isEmpty()){
12    int[]cur=q.poll();
13    int r=cur[0];
14    int c=cur[1];
15    int dist=cur[2];
16    if(r==n-1 && c==n-1)return dist;
17    for(int[]i:dir){
18        int nr=r+i[0];
19        int nc=c+i[1];
20        if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0){
21grid[nr][nc]=1;
22q.offer(new int[]{nr,nc,dist+1});
23        }
24    }
25}
26return -1;
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63    // int c=Integer.MAX_VALUE;    tle
64    // void bt(int[][]grid,int n,int i,int j,int st){
65    //     if(i<0 || j<0 || i>=n||j>=n || grid[i][j]==1)return;
66    //     if(i==n-1 && j==n-1){c=Math.min(c,st+1);return;}
67    //     grid[i][j]=1;
68    //     bt(grid,n,i+1,j,st+1);
69    //     bt(grid,n,i,j+1,st+1);
70    //     bt(grid,n,i-1,j,st+1);
71    //     bt(grid,n,i,j-1,st+1);
72    //     bt(grid,n,i+1,j+1,st+1);
73    //     bt(grid,n,i-1,j-1,st+1);
74    //     bt(grid,n,i-1,j+1,st+1);
75    //     bt(grid,n,i+1,j-1,st+1);
76    //     grid[i][j]=0;
77    // }
78    // public int shortestPathBinaryMatrix(int[][] grid) {
79    //     bt(grid,grid.length,0,0,0);
80    //     return c==Integer.MAX_VALUE?-1:c;
81    }
82}