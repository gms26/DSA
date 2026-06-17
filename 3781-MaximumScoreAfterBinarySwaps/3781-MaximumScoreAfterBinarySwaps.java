// Last updated: 6/17/2026, 5:16:30 PM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] mat) {
3        List<Integer>a=new ArrayList<>();
4        boolean f=false;
5        for(int i=0;i<mat.length;i++){
6            int c=0;
7            for(int j=0;j<mat[0].length;j++){
8                if(mat[i][j]<mat[i][c]){
9                    c=j;
10                }
11            }
12            boolean s=false;
13            int v=mat[i][c];
14            for(int k=0;k<mat.length;k++){
15                if(mat[k][c]>v){
16                    s=true;
17                    break;
18                }
19            }
20            if(!s)a.add(v);
21        }
22        return a;
23    }
24}