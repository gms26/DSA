// Last updated: 9/28/2026, 10:29:20 PM
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       char []arr=s.toCharArray();
       int []diff=new int[s.length()+1];
       int t=0;
       for(int[]q:shifts){
        
         int l = q[0];
            int r = q[1];
            int dir = q[2];

           
            if (dir == 1) {

                diff[l] += 1;

                if (r + 1 < s.length()) {
                    diff[r + 1] -= 1;
                }
            }

           
            else {

                diff[l] -= 1;

                if (r + 1 < s.length()) {
                    diff[r + 1] += 1;
                }
            }}
            int c=0;
        for(int i=0;i<s.length();i++){
            c += diff[i];

            int val = (arr[i] - 'a' + c) % 26;

          
            if (val < 0) {
                val += 26;
            }

            arr[i] = (char)(val + 'a');
       } 
       return new String(arr);
    }
}