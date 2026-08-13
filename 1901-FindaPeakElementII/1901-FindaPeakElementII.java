// Last updated: 8/13/2026, 7:37:06 PM
1class Solution {
2    public int[] findPeakGrid(int[][] mat) {
3        //int[]ar=new int[2];
4        int  m=mat.length,n=mat[0].length;
5        for(int i=0;i<mat.length;i++){
6            
7            for(int j=0;j<mat[0].length;j++){
8                boolean peak=true;
9                if (i > 0 && mat[i][j] <= mat[i - 1][j]) {
10                    peak = false;
11                }
12
13            
14                if (i < m - 1 && mat[i][j] <= mat[i + 1][j]) {
15                    peak = false;
16                }
17
18                
19                if (j > 0 && mat[i][j] <= mat[i][j - 1]) {
20                    peak = false;
21                }
22
23                
24                if (j < n - 1 && mat[i][j] <= mat[i][j + 1]) {
25                    peak = false;
26                }
27if (peak) {
28                    return new int[]{i, j};
29                }
30                
31        }
32        
33    }return new int[]{-1,-1};
34}}