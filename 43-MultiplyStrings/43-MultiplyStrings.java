// Last updated: 5/25/2026, 11:13:12 AM
class Solution {
    public String multiply(String n1, String n2) {
        if(n1.equals("0")||n2.equals("0"))return "0";
        int n=n1.length(),m=n2.length();
        int[]r=new int[n+m];
        for(int i=n-1;i>=0;i--){
           
        for(int j=m-1;j>=0;j--){
            int mul=(n1.charAt(i)-'0')*(n2.charAt(j)-'0');
            int s=mul+r[i+j+1];
            r[i+j+1]=s%10;
            r[i+j]+=s/10;
        }}
        StringBuilder sb=new StringBuilder();
        for(int i:r){
            if(!(sb.length()==0 && i==0))sb.append(i);
        }
        return sb.toString();
    }
}