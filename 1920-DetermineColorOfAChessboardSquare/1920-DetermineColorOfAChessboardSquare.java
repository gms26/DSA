// Last updated: 5/25/2026, 11:05:26 AM
class Solution {
    public boolean squareIsWhite(String c) {
        
            int a=c.charAt(0);
            int b=c.charAt(1);
            if(a%2!=0 && b%2!=0){
                return false;
            }
        else if(a%2==0 && b%2==0){
        return false;
          } 
          else{
            return true;
          } }
}