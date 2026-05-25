// Last updated: 5/25/2026, 11:04:41 AM
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