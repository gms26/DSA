// Last updated: 7/24/2026, 6:06:42 PM
class Solution {
    public String processStr(String s1) {
        StringBuilder s=new StringBuilder();
        char z='q';
        for(char c:s1.toCharArray()){
            if(c>=97 && c<123){
                s.append(c);
                
            }
            else if(s.length()>0 && c=='*'){
                s.deleteCharAt(s.length()-1);
            }
            else if(c=='#'){
                s.append(s);
            }
            else if(c=='%'){
                s.reverse();
            }
        }
       return s.toString();
    }
}