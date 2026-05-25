// Last updated: 5/25/2026, 11:09:13 AM
class Solution {
    public String[] findRelativeRanks(int[] s) {
        Integer a[]=new Integer[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=s[i];
        }
        Arrays.sort(a,Collections.reverseOrder());
        String b[]=new String[s.length];
        
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
            if(s[i]==a[j] ){
                if(j==0){
                    b[i]="Gold Medal";
                    
                }
                else if(j==1){
                    b[i]="Silver Medal";
                    
                }
                else if(j==2){
                    b[i]="Bronze Medal";
                
                }
            
            else{
                
                        b[i]=String.valueOf(j+1);
                        
                }
            }}
        }return b;
}}