// Last updated: 5/25/2026, 11:06:08 AM
class Solution {
    public int maxVowels(String s, int k) {
    
        int c2=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')c2++;
        }
        int s1=c2;
        for(int i=1;i<s.length()-k+1;i++){
            char c=s.charAt(i-1);
            char c1=s.charAt(i+k-1);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')c2--;
            if(c1=='a'|| c1=='e'||c1=='i'||c1=='o'||c1=='u')c2++;
            if(c2>s1)s1=c2;
        }
        return s1;
    }
}