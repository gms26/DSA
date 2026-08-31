// Last updated: 8/31/2026, 12:21:41 PM
class Solution {
    public String interpret(String cmd) {
        String s="";
        for(int i=0;i<cmd.length();i++){
            char c=cmd.charAt(i);
            if(Character.isLetter(c)){
                s+=c+"";
            }
            else if(c=='(' && cmd.charAt(i+1)==')'){
                s+="o";
            }
        }
        return s;
    }
}