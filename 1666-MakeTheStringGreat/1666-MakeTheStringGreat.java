// Last updated: 5/25/2026, 11:05:53 AM
class Solution {
    public String makeGood(String s) {
        StringBuilder a=new StringBuilder();
        
        for(char c:s.toCharArray()){
            int n=a.length();
            if(n>0&& Math.abs(a.charAt(n-1)-c)==32)a.deleteCharAt(n-1);
            else a.append(c);
        }
       return a.toString();
    }
}