// Last updated: 5/25/2026, 11:05:37 AM
class Solution {
    public int largestSubmatrix(int[][] m) {
        
        for(int i=1;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==1){
                    m[i][j]+=m[i-1][j];
                }
                
            }
        }
        for(int[] i:m){
            Arrays.sort(i);
        }
        int max=0;
        for(int i=0;i<m.length;i++){
            for(int j=m[0].length-1;j>=0;j--){
                int height=m[i][j];
                int width=m[0].length-j;
                max=Math.max(max,height*width);
            }
        }
        
        return max;
    }
}