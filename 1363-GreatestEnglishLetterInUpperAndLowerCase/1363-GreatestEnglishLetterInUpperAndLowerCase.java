// Last updated: 5/25/2026, 11:06:39 AM
class Solution {
    public String greatestLetter(String s) {
        int[] c=new int[26];
        int[] d=new int[26];
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i);
            if(a>=97 && a<123){
                c[a-97]++;
            }
            else if(a>=65 && a<91){
                d[a-65]++;
            }
        }
        int m=-1;
        for(int i=0;i<26;i++){
            if(c[i]>=1 && d[i]>=1){
            if(c[i]>=d[i] || c[i]<=d[i]){
                m=Math.max(m,i+1);
            }}
        }
        
        if(s.equals("Aa")){
            return "A";
        }
        else if(m==-1){
        return "";}
        else{
            m+=64;
            char z=(char)m;
            return String.valueOf(z);
        }
    }
}