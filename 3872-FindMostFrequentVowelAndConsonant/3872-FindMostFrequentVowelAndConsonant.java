// Last updated: 5/25/2026, 11:03:07 AM
class Solution {
    public int maxFreqSum(String s) {
        int[] f=new int[26];
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                f[c-'a']++;
            }
            else{
                f[c-'a']++;
            }
        }
        int m=0,m1=0;
        for(char v:"aeiou".toCharArray()){
            m=Math.max(m,f[v-'a']);
            
        }
        for(int i=0;i<26;i++){
            if(i!=0&&i!=4&&i!=8&&i!=14&&i!=20){
            m1=Math.max(m1,f[i]);}
        }
        return m+m1;
    }
}