// Last updated: 7/14/2026, 12:23:34 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3       HashMap<Integer,List<Integer>>h=new HashMap<>();
4       for(int i=0;i<board.length;i++){
5        for(int j=0;j<board[0].length;j++){
6            if(board[i][j]=='.')continue;
7            int t=board[i][j]-'0';
8            if(!h.containsKey(t)){
9                h.put(t,new ArrayList<>(Arrays.asList(i,j)));
10            }
11            else
12            {
13                List<Integer> l=h.get(t);
14                for(int z=0;z<l.size();z+=2)
15                {
16                    int row=l.get(z);
17                    int col=l.get(z+1);
18                    if(row==i||col==j)return false;
19                    if(row/3==i/3&&col/3==j/3)return false;
20                }
21                h.get(t).add(i);
22                h.get(t).add(j);
23            }
24        }
25       }
26       return true;
27    }
28}