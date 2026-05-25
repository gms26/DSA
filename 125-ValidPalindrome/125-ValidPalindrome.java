// Last updated: 5/25/2026, 11:11:54 AM
class Solution {
    public boolean isPalindrome(String s) {
        String x=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder a=new StringBuilder(x);
        
        String b=a.reverse().toString();
        return b.equals(x);
    }
}