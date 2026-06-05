// Last updated: 6/5/2026, 9:05:47 AM
1class Solution {
2    public int[][] diagonalSort(int[][] mat) {
3        Map<Integer,PriorityQueue<Integer>>a=new HashMap<>();
4        for(int i=0;i<mat.length;i++){
5            for(int j=0;j<mat[0].length;j++){
6                int c=i-j;
7                a.putIfAbsent(c,new PriorityQueue<>());
8                a.get(c).add(mat[i][j]);
9            }
10        }
11       
12        
13        for(int i=0;i<mat.length;i++){
14            for(int j=0;j<mat[0].length;j++){
15                int c=i-j;
16                mat[i][j]=a.get(i-j).poll();
17            }
18        }
19        return mat;
20    }
21}