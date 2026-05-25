// Last updated: 5/25/2026, 11:08:08 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] b) {
        int m=b.length;
        
        
        for(int i=0;i<m;i++){
            int l=0,r=b[i].length-1;
            while(l<r){
                int t=b[i][l];
                b[i][l]=b[i][r];
                b[i][r]=t;
                l++;
                r--;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]==0){
                    b[i][j]=1;
                }
                else{
                    b[i][j]=0;
                }
            }
        }
        return b;
    }
}