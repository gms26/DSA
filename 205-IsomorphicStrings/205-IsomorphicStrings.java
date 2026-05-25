// Last updated: 5/25/2026, 11:11:07 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
        return false;}
        char[] s1=new char[256];
        char[] s2=new char[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(s1[a]!=0 && s1[a] != b){
                return false;
            }
            if(s2[b]!=0 && s2[b] != a){
                return false;
            }
            s1[a]=b;
            s2[b]=a;
        }
        return true;
    }
}