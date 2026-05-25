// Last updated: 5/25/2026, 11:07:19 AM
class Solution {
    public String removeOuterParentheses(String s) {
        String r="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && c++>0){
                r+=s.charAt(i);
            }
            if(s.charAt(i)==')' && c-->1){
                r+=s.charAt(i);
            }
        }return r;

    }
}