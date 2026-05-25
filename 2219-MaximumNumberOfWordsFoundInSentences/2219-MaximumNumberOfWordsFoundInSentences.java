// Last updated: 5/25/2026, 11:04:50 AM
class Solution {
    public int mostWordsFound(String[] s) {
        int a=0;
       
        for(int i=0;i<s.length;i++){
            String b=s[i];
            String[] c=b.split(" ");
            if(a<c.length){
                a=c.length;
            }
        }
        return a;
    }
}