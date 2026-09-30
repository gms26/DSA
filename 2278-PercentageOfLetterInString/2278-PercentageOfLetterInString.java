// Last updated: 9/30/2026, 9:53:48 AM
class Solution {
    public int percentageLetter(String s, char l) {
        int c=0;
        for(int i=0;i<s.length();i++){
            
                if(s.charAt(i)==l){
                    c++;
                }
            
        }
        
        int a=100;
        return a*c/s.length();
    }
}