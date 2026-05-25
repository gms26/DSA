// Last updated: 5/25/2026, 11:11:24 AM
class Solution {
    public int titleToNumber(String c) {
        int r=0;
         for (int i=0;i<c.length();i++){
            r*=26;
            r+=c.charAt(i)-'A'+1;
         }
         return r;
    }
}