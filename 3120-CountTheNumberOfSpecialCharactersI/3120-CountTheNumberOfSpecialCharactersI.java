// Last updated: 9/28/2026, 10:26:19 PM
class Solution {
    public int numberOfSpecialChars(String w) {
        char a='Z';
        int c=0;
        for(int i=a;i>='A';i--){
            if(w.indexOf((char)i)!=-1 && w.indexOf(Character.toLowerCase((char)i))!=-1)c++;
        }
return c;
    }
}