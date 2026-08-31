// Last updated: 8/31/2026, 12:20:59 PM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
     int m=mat.length;
     int n=mat[0].length;
     int[][]a=new int[m][n];
     int z=m-1;
     boolean f=true;
      for(int i=0;i<m;i++){ //1
        for(int j=0;j<n;j++){
            if(mat[i][j]!=target[i][j]){
                f= false;
            }
          
        }
      
     }
     if(f)return f;
     f=true;
     for(int i=0;i<m;i++){ //2
        for(int j=0;j<n;j++){
            a[j][n-i-1]=mat[i][j];
        }
        
     }
 for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]!=target[i][j]){
                f= false;
            }
          
        }
      
     }
     if(f)return f;
     f=true;
for(int i=0;i<m;i++){ //3
        for(int j=0;j<n;j++){
            a[i][j]=mat[m-i-1][n-j-1];
        }
     }
 for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]!=target[i][j]){
                f= false;
            }
          
        }
      
     }
    if(f)return f;
    f=true;
    for(int i=0;i<m;i++){ //4
        for(int j=0;j<n;j++){
            mat[i][j]=a[n-j-1][i];
        }
     }
 for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]!=target[i][j]){
                f= false;
            }
          
        }
      
     }
     if(f)return true;
     return false;
    }
}