// Last updated: 5/25/2026, 11:08:42 AM
class Solution {
    public boolean judgeCircle(String m) {
        int  a=0,b=0;
        for(char i:m.toCharArray()){
            if(i=='U')a++;
            else if(i=='D')a--;
            else if(i=='L')b++;
            else b--;
        }
        
        return a==0&&b==0;
    }
}