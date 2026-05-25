// Last updated: 5/25/2026, 11:03:44 AM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int[]a=new int[grid.length*grid[0].length];
        int z=0;
        int mod=12345;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[z++]=grid[i][j]%mod;
            }
        }
        int []l=new int[a.length];
        int[]r=new int[a.length];
        l[0]=1;
        r[a.length-1]=1;
      
     
for(int i = 1; i < a.length; i++) {
    l[i] = (int)(1L*l[i-1] * a[i-1]) % mod;
}

for(int j = a.length - 2; j >= 0; j--) {
    r[j] =(int)(1L*r[j+1] * a[j+1]) % mod;
}
        int [][]ans=new int[grid.length][grid[0].length];
        z=0;
        for(int m=0;m<grid.length;m++){
            for(int n=0;n<grid[0].length;n++){
                ans[m][n]=(int)(1L*l[z]*r[z])%mod;
                z++;
            }
        }
        return ans;
    }
}