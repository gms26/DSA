// Last updated: 9/28/2026, 10:25:55 PM
class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int a=c1.charAt(0);
        int b=c1.charAt(1);
        int c=c2.charAt(0);
        int d=c2.charAt(1);
        return ((a+b)%2)==((c+d)%2);
    }
}