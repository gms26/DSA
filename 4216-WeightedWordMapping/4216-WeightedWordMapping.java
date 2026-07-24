// Last updated: 7/24/2026, 6:06:31 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder a=new StringBuilder();
        for(String s:words){
            int s1=0;
            for(int j=0;j<s.length();j++){
                int a1=s.charAt(j)-'a';
                s1+=weights[a1];
            }
            a.append((char)('z'-(s1%26)));
        }
        return a.toString();
    }
}