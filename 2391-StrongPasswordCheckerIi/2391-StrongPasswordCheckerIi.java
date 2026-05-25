// Last updated: 5/25/2026, 11:04:35 AM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int lc=0,uc=0,d=0,sp=0;
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(Character.isUpperCase(c)){
                uc++;
            }
            if(Character.isLowerCase(c)){
                lc++;
            }
            if(i>0 && password.charAt(i)==password.charAt(i-1))return false;
            if(Character.isDigit(c)){
                d++;
            }
            if(!Character.isLetterOrDigit(c))sp++;
        }
        if(password.length()>7 && uc>0 && lc>0 && d>0 && sp>0)return true;
        return false;
    }
}