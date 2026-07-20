// Last updated: 7/20/2026, 6:13:27 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int m) {
3        List<List<Integer>>a=new ArrayList<>();
4        int o=grid.length,p=grid[0].length;
5        
6        for(int i=0;i<m;i++){
7        int[][]ar=new int[o][p];
8            for(int j=0;j<grid.length;j++){
9                for(int k=0;k<grid[0].length;k++){
10                    
11                    if(k<grid[0].length-1){
12                        ar[j][k+1]=grid[j][k];
13                    }
14                    if(k==p-1 && j<grid.length-1){
15                        ar[j+1][0]=grid[j][k];
16                    }
17                    if(j==o-1 && k==p-1){
18                        ar[0][0]=grid[j][k];
19                    }
20                }
21            }
22            grid=ar;
23        }
24        for(int i=0;i<o;i++){
25            ArrayList<Integer>z=new ArrayList<>();
26            for(int j=0;j<p;j++){
27                z.add(grid[i][j]);
28            }
29            a.add(z);
30        }
31        return a;
32    }
33}