// Last updated: 5/25/2026, 11:12:43 AM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder m=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0 || c>0){
            int s=c;
            if(i>=0){
                s+=a.charAt(i--)-'0';
            }
            if(j>=0){
                s+=b.charAt(j--)-'0';
            }
            m.append(s%2);
            c=s/2;
        }
        return m.reverse().toString();
    }
}