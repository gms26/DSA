// Last updated: 5/25/2026, 11:08:04 AM
class Solution {
    public boolean lemonadeChange(int[] b) {

        int m=0,n=0,o=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==5){
                m++;
            }
            else if(b[i]==10){
                if(m>=1){
                    m--;
                    n++;
                }
                else{
                    return false;
                }
                
            }
            else{
                if(m>=1 && n>=1){
                    m--;
                    n--;
                    o++;
                }
                else if(m>=3){
                    m-=3;
                    o++;
                }
                else{
                    return false;
                }
                
            }
        }
        return true;
    }
}