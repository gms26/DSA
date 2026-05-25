// Last updated: 5/25/2026, 11:05:19 AM
class Solution {
    public int countGoodSubstrings(String s) {
        int a=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2)){
                a++;
            }
        }
        return a;
    }
}