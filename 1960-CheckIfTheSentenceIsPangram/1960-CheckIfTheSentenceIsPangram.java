// Last updated: 5/25/2026, 11:05:23 AM
class Solution {
    public boolean checkIfPangram(String s) {
        char a[]=new char[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                return false;
                
            }
        }
        return true;
    
    }
}