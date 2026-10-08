// Last updated: 10/8/2026, 5:20:57 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        String r="";
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='(' && c++>0){
7                r+=s.charAt(i);
8            }
9            if(s.charAt(i)==')' && c-->1){
10                r+=s.charAt(i);
11            }
12        }return r;
13
14    }
15}