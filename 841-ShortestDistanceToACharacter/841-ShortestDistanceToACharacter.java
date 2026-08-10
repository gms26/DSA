// Last updated: 8/10/2026, 12:20:20 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int[]a=new int[s.length()];
        Arrays.fill(a,Integer.MAX_VALUE);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)a[i]=0;
        }
        int i=0,j=0;
        while(i<s.length() && j<s.length()){
            char c1=s.charAt(j);
            if(c1==c){
                for(int k=i;k<j;k++){
                    a[k]=j-k;
                }
                i=j+1;
            }
            j++;
        }
        i=s.length()-1;j=s.length()-2;
     //   System.out.println(s.charAt(j));
        while(i>=0 && j>=0){
            char c1=s.charAt(j);
            if(c1==c){
                for(int k=i;k>j;k--){
                    a[k]=Math.min(a[k],k-j);
                }
                i=j-1;
            }
            j--;
        }
        return a;
    }
}