// Last updated: 5/25/2026, 11:05:54 AM
class Solution {
    public String restoreString(String s, int[] in) {
        int a=s.length();
        char []b=new char[a];
        for(int i=0;i<a;i++){
          b[in[i]]=s.charAt(i);
        }
        return new String(b); 
    }
}