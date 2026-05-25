// Last updated: 5/25/2026, 11:03:29 AM
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