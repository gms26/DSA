// Last updated: 8/10/2026, 12:23:05 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] fre=new int[128];
        for(char c:s.toCharArray()){
            fre[c]++;
        }
        int res=0;
        boolean check=false;
        for(int x:fre){
            if(x%2==0) res+=x;
            else {
                res+=x-1;
                check=true;
                }
        }
        if(check){
            res++;
        }
        return res;
    }
}