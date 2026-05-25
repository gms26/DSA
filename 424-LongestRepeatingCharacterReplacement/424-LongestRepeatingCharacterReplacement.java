// Last updated: 5/25/2026, 11:09:41 AM
class Solution {
    public int characterReplacement(String s, int k) {
     int l=0,maxl=0,ans=0;
     int [] ar=new int[26];
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        ar[c-'A']++;
        maxl=Math.max(maxl,ar[c-'A']);
        while((i-l)+1-maxl>k){
            ar[s.charAt(l)-'A']--;
            l++;
        }
        ans=Math.max(ans,i-l+1);
     }   
     return ans;
    }
}