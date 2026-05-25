// Last updated: 5/25/2026, 11:09:40 AM
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty())
        return 0;
        String []a=s.split(" +");
        return a.length;
    }
}