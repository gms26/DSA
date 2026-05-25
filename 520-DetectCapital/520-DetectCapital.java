// Last updated: 5/25/2026, 11:09:08 AM
class Solution {
    public boolean detectCapitalUse(String w) {
        int c=0;
        int s=0;
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)>=65 && w.charAt(i)<=90){
                c++;
            }
            else if(w.charAt(i)>=97 && w.charAt(i)<=122){
                s++;
            }
        }
        if(c==w.length()){
            return true;
        }
        else if(c==1 && Character.isUpperCase(w.charAt(0))){
            return true;
        }
        else if(s==w.length()){
            return true;
        }
        return false;
    }
}