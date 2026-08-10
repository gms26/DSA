// Last updated: 8/10/2026, 12:18:22 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>l=new ArrayList<>();
        int ls=String.valueOf(low).length();
        int hs=String.valueOf(high).length();
        String s="123456789";
        for(int i=ls;i<=hs;i++){
            for(int j=0;i+j<=9;j++){
                int a=Integer.parseInt(s.substring(j,i+j));
                if(a>=low && a<=high){
                    l.add(a);
                }
            }
        }
        return l;
    }
}