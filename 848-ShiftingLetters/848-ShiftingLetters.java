// Last updated: 5/29/2026, 10:56:13 PM
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        int t=0;char[]ar= s.toCharArray();
4        for(int i=shifts.length-1;i>=0;i--){
5            t=(t+shifts[i])%26;
6            int v=(ar[i]-'a'+t)%26;
7            ar[i]=(char)(v+'a');
8            
9        }
10        return new String(ar);
11    }
12}