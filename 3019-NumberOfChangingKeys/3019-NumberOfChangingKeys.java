// Last updated: 9/28/2026, 10:26:49 PM
class Solution {
    public int countKeyChanges(String s) {
        String a=s.toLowerCase();
        int c=0;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)!=a.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}