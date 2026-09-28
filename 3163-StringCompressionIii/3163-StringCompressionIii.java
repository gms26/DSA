// Last updated: 9/28/2026, 10:26:09 PM
class Solution {
    public String compressedString(String word) {
        StringBuilder a=new StringBuilder();
        int c=1;
        for(int i=1;i<=word.length();i++){
            if(i<word.length()&&word.charAt(i)==word.charAt(i-1) && c<9  ){
                c++;
            }
            else{
                a.append(c);
                    a.append(word.charAt(i-1));
                    c=1;
            }
        }
        return a.toString();
    }
}