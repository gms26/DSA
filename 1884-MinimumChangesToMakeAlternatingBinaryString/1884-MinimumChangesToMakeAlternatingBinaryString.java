// Last updated: 5/25/2026, 11:05:34 AM
class Solution {
    public int minOperations(String s) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            char s1=(i%2==0)?'0':'1';
            char s2=(i%2==0)?'1':'0';
            if(s.charAt(i)!=s1)c1++;
            if(s.charAt(i)!=s2)c2++;
        }
        return Math.min(c1,c2);
    }
}