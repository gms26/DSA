// Last updated: 5/25/2026, 11:11:27 AM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder c=new StringBuilder();
        while(n>0){
            int r=n%26;
            if(r==0){
                c.append("Z");
                n=(n/26)-1;
            }
            else{
                c.append((char)((r-1)+'A'));
                n=n/26;
            }
        }
        c=c.reverse();
        String s=c.toString();
        return s;
        
    }
}