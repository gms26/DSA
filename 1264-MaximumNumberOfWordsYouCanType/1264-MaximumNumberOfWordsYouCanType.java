// Last updated: 5/25/2026, 11:06:53 AM
class Solution {
    public int canBeTypedWords(String t, String b) {
        String[] r=t.split(" ");
        int n=0;
        for(int i=0;i<b.length();i++){
            char s=b.charAt(i);
            String a=String.valueOf(s);
            for(int j=0;j<r.length;j++){
                if(r[j].contains(a)){
                    r[j]=" ";
                }
            }  
        }
        for(int i=0;i<r.length;i++){
            if(r[i]!=" "){
                n++;
            }
        }       
        return n;
    }
}