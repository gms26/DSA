// Last updated: 6/30/2026, 10:06:29 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3       int[]ar =new int[3];
4       int l=0,ans=0;
5       for(int i=0;i<s.length();i++){
6        ar[s.charAt(i)-'a']++;
7        while(ar[0]>0 && ar[1]>0 && ar[2]>0){
8            ans+=s.length()-i;
9            ar[s.charAt(l)-'a']--;
10            l++;
11        }
12       }
13return ans;
14    }
15}