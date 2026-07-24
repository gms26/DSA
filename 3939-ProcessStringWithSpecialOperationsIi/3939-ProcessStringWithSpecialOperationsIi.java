// Last updated: 7/24/2026, 6:06:40 PM
class Solution {
    public char processStr(String s, long k) {
        StringBuilder a=new StringBuilder();
        long l=0;
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                l++;
            }
            else if(c=='#'){
                l*=2;
            }
           
            else if(c=='*'){
                if(l>0)
                l--;
            }
            
        }
        if(k>=l){
            return '.';
        }
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                if(k==l-1)return c;
                l--;
            }
            else if(c=='#'){
                l/=2;
                k%=l;
            }
            else if(c=='%'){
                k=l-1-k;
            }
            else if(c=='*'){
                
                l++;
            }
            
        }
        return '.';
    }
}