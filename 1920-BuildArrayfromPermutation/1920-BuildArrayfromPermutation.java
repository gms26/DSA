// Last updated: 8/10/2026, 10:07:57 PM
1class Solution {
2    public String interpret(String cmd) {
3        String s="";
4        for(int i=0;i<cmd.length();i++){
5            char c=cmd.charAt(i);
6            if(Character.isLetter(c)){
7                s+=c+"";
8            }
9            else if(c=='(' && cmd.charAt(i+1)==')'){
10                s+="o";
11            }
12        }
13        return s;
14    }
15}