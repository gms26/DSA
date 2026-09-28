// Last updated: 9/28/2026, 10:26:39 PM
class Solution {
    public int[][] modifiedMatrix(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                
                if(m[i][j]==-1){
                    int a=Integer.MIN_VALUE;
                    for(int k=0;k<m.length;k++){
                        
                        if(a<m[k][j]){
                            a=m[k][j];
                        }
                        
                    }
                    m[i][j]=a;
                    
                }
            }
        }
        return m;
    }
}