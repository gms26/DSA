// Last updated: 5/25/2026, 11:12:31 AM
class Solution {
    boolean back(char[][]b,String w,int i,int j,int index){
        if(index==w.length()){
            return true;
        }
        if(i<0 || j<0 || i>=b.length||j>=b[0].length||b[i][j]!=w.charAt(index)){
            return false;
        }
        char temp=b[i][j];
        b[i][j]='.';
        boolean found=back(b,w,i+1,j,index+1)||back(b,w,i-1,j,index+1)||back(b,w,i,j+1,index+1)||back(b,w,i,j-1,index+1);
        b[i][j]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(back(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}