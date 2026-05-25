// Last updated: 5/25/2026, 11:12:46 AM
class Solution {
    public boolean isNumber(String s) {
        boolean hasnum=false,hasdot=false,hase=false,hasnumaftere=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                hasnum=true;
                if(hase) hasnumaftere=true;
            }
            else if(c=='+'||c=='-'){
                if(i!=0 && s.charAt(i-1)!='e'&&s.charAt(i-1)!='E')return false;
            }else if(c=='.'){
                if(hasdot||hase)return false;
                hasdot=true;
            }
            else if(c=='e'||c=='E'){
                if(hase||!hasnum)return false;
                hase=true;
                hasnumaftere=false;
            }
            else{
                return false;
            }
        }
        return hasnum&&(!hase||hasnumaftere);
    }
}