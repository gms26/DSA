// Last updated: 5/25/2026, 11:13:21 AM
class Solution {
    public int longestValidParentheses(String s) {
        int maxval=0;
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }
            else if(c==')'){
                close++;
            }
            if(open==close){
                maxval=Math.max(maxval,2*close);
            }
            else if(close>open){
                open=close=0;
            }
        }
        open=close=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }
            else if(c==')'){
                close++;
            }
            if(open==close){
                maxval=Math.max(maxval,2*open);
            }
            else if(open>close){
                open=close=0;
            }
        }
        return maxval;
    }
}