// Last updated: 5/25/2026, 11:05:03 AM
class Solution {
    public String reversePrefix(String w, char c) {
        int s=w.indexOf(c);
        StringBuilder x=new StringBuilder();
        if(s<0)
        return w;
        else{
            x.append(w,0,s+1);
        }
        x=x.reverse();
        x.append(w,s+1,w.length());
        return x.toString();
    }
}