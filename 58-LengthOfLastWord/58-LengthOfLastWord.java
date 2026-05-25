// Last updated: 5/25/2026, 11:12:54 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        boolean w=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '&& w)break;
            else if(s.charAt(i)!=' '){
                c++;
                w=true;
            }
        }return c;
    }
}