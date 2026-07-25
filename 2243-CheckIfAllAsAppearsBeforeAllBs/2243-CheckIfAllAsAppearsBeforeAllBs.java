// Last updated: 7/25/2026, 10:18:06 AM
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