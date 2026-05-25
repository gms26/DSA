// Last updated: 5/25/2026, 11:13:16 AM
class Solution {
    public void solveSudoku(char[][] board) {
        back(board);
    }
    boolean back(char[][]board){
            for(int r=0;r<9;r++){
                for(int c=0;c<9;c++){
                    if(board[r][c]=='.'){
                        for(char i='1';i<='9';i++){
                            if(valid(board,r,c,i)){
                                board[r][c]=i;
                                if(back(board)){
                                    return true;
                                }
                                board[r][c]='.';
                            }
                        }
                        return false;
                    }
                }
            }return true;
    }
    boolean valid(char [][]board,int r,int c,char i){
        for(int j=0;j<9;j++){
            if(board[r][j]==i)return false;
            if(board[j][c]==i)return false;
            int br=3*(r/3)+j/3;
            int bc=3*(c/3)+j%3;
            if(board[br][bc]==i)return false;
        }
        return true;
    }
}