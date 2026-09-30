// Last updated: 9/30/2026, 9:54:24 AM
class Solution {
    public boolean checkString(String s) {
        int a=0,b=0;
        for(char c:s.toCharArray()){
            if(c=='a' && b==0){
                a++;
            }
            else if(c=='b'){
                b++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}