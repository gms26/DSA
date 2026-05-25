// Last updated: 5/25/2026, 11:13:02 AM
class Solution {
    List<List<String>> res=new ArrayList<>();
        char board[][];
        Set<Integer> col=new HashSet<>();
        Set<Integer> pd=new HashSet<>();
        Set<Integer> nd=new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        back(0,n);
        return res;
    }
    void back(int r,int n){
        if(r==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            res.add(l);
            return;
        }
        for(int c=0;c<n;c++){
            if(!(col.contains(c)|| pd.contains(r+c) || nd.contains(r-c))){
                board[r][c]='Q';
                col.add(c);
                pd.add(r+c);
                nd.add(r-c);
                back(r+1,n);
                board[r][c]='.';
                col.remove(c);
                pd.remove(r+c);
                nd.remove(r-c);
            }
        }
    }
}