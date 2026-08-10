// Last updated: 8/10/2026, 12:20:10 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int t=0;char[]ar= s.toCharArray();
        for(int i=shifts.length-1;i>=0;i--){
            t=(t+shifts[i])%26;
            int v=(ar[i]-'a'+t)%26;
            ar[i]=(char)(v+'a');
            
        }
        return new String(ar);
    }
}