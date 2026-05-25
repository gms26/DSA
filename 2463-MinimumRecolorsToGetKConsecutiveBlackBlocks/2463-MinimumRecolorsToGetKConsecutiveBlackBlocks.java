// Last updated: 5/25/2026, 11:04:28 AM
class Solution {
    public int minimumRecolors(String b, int k) {
        int c=0,s=0;
        for(int i=0;i<k;i++){
    
            if(b.charAt(i)=='W'){
                s++;
            } 
        }
        c=s;
        for(int i=1;i<b.length()-k+1;i++){
            if(b.charAt(i-1)=='W')s--;
            if(b.charAt(i+k-1)=='W')s++;
            if(s<c)c=s;
        }
        return c;
    }
}