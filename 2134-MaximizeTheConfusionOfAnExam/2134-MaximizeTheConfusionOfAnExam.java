// Last updated: 5/25/2026, 11:05:02 AM
class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int m=0,ct=0,cf=0,s=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='T')ct++;
            else cf++;
            while(Math.min(ct,cf)>k){
                if(a.charAt(s)=='T')ct--;
                else cf--;
                s++;
            }
            int l=i-s+1;
            if(l>m)m=l;
            
            
                
            
            
        }return m;
    }
}