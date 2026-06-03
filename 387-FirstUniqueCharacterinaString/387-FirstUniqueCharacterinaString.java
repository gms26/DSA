// Last updated: 6/3/2026, 6:09:20 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] a=new int[26];
4        for(int i=0;i<s.length();i++){
5            a[s.charAt(i)-'a']++;}
6        for(int j=0;j<s.length();j++){
7                if(a[s.charAt(j)-'a']==1){
8                   return j;
9                }
10            }
11            
12               
13           
14        return-1;
15}}