// Last updated: 5/25/2026, 11:12:34 AM
class Solution {
    public String minWindow(String s, String t) {
        int[]need=new int[256];
        int[]window=new int[256];
        if(s.length()<t.length())return "";
        for(char c:t.toCharArray()){
            need[c]++;
        }
        int req=0;
        for(int i:need)if(i>0)req++;
        int formed=0,minlen=Integer.MAX_VALUE,l=0,start=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            window[c]++;
            if(need[c]>0 && window[c]==need[c]){
                formed++;
            }
            while(formed==req){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    start=l;
                }
                char leftchar=s.charAt(l);
                window[leftchar]--;
                if(need[leftchar]>0 && window[leftchar]<need[leftchar]){
                formed--;
            }
            l++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,minlen+start);
    }
}