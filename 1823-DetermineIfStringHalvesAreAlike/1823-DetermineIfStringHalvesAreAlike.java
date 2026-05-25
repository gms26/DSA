// Last updated: 5/25/2026, 11:05:41 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        String b="aeiouAEIOU";
        int f=0,f1=0;
        for(int i=0;i<s.length()/2;i++){
            if(b.indexOf(s.charAt(i))!=-1){
                f++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(b.indexOf(s.charAt(i))!=-1){
                f1++;
            }
        }
        return f==f1;
    }
}