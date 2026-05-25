// Last updated: 5/25/2026, 11:13:25 AM
class Solution {
    public int strStr(String a, String b) {
        if(a.contains(b)){
            return a.indexOf(b);
        }
        else{
            return -1;
        }
        
    }
}