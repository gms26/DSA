// Last updated: 5/25/2026, 11:09:34 AM
class Solution {
    public int compress(char[] c) {
        int i=0;
        int j=0;
        while(i<c.length){
            char a=c[i];
            int s=0;
            while(i<c.length && c[i]==a){
                i++;
                s++;
            }
            c[j++]=a;
            if(s>1){
                for(char k:String.valueOf(s).toCharArray()){
                    c[j++]=k;
                }
            }
        }
        return j;
    }
}