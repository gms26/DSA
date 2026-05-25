// Last updated: 5/25/2026, 11:03:39 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int m=0,n=0;
        for(int i=0;i<d.length;i++){
            int c=0;
            int a=0;
            c+=d[i][0]*d[i][0]+d[i][1]*d[i][1];
            a=d[i][0]*d[i][1];
            if(m<c || c==m && a>n){
                m=c;
                n=a;
            }
        }
        return n;
    }
}