// Last updated: 5/25/2026, 11:05:22 AM
class Solution {
    public String sortSentence(String s) {
        String[]a=s.split(" ");
        String []b=new String[a.length];
        for(String w:a){
            int p=Character.getNumericValue(w.charAt(w.length()-1))-1;
            b[p]=w.substring(0,w.length()-1);
        }       
    return String.join(" ",b);
}
}
