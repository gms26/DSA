// Last updated: 7/25/2026, 10:19:09 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer>a=new ArrayList<>();
        boolean f=false;
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]<mat[i][c]){
                    c=j;
                }
            }
            boolean s=false;
            int v=mat[i][c];
            for(int k=0;k<mat.length;k++){
                if(mat[k][c]>v){
                    s=true;
                    break;
                }
            }
            if(!s)a.add(v);
        }
        return a;
    }
}