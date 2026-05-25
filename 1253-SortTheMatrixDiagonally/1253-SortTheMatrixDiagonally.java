// Last updated: 5/25/2026, 11:06:57 AM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer,PriorityQueue<Integer>>a=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int c=i-j;
                a.putIfAbsent(c,new PriorityQueue<>());
                a.get(c).add(mat[i][j]);
            }
        }
       
        int[][]res=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int c=i-j;
                res[i][j]=a.get(c).poll();
            }
        }
        return res;
    }
}