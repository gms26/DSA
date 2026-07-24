// Last updated: 7/24/2026, 6:06:46 PM
class Solution {
    
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        List<Integer>l=new ArrayList<>();
        List<Character>ch=new ArrayList<>(); 
        char []ca=s.toCharArray();
        int c=0;
        for(char c1:ca)if(c1=='1')c++;
        int i=0;
        while(i<s.length()){
            int j=i,cnt=0;
            char z=s.charAt(j);
            while(j<s.length() && s.charAt(j)==z){
                cnt++;
                j++;
            }
            i=j;
            l.add(cnt);
            ch.add(z);
        }
        int r=c;
        for(int j=1;j<l.size()-1;j++){
            if(ch.get(j)=='1' && ch.get(j-1)=='0' && ch.get(j+1)=='0'){
                r=Math.max(r,l.get(j-1)+l.get(j+1)+c);
            }
        }
        return r;
    }
} 