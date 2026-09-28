// Last updated: 9/28/2026, 10:26:53 PM
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