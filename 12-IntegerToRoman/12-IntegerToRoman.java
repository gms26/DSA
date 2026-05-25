// Last updated: 5/25/2026, 11:13:44 AM
class Solution {
    public String intToRoman(int num) {
        int[] a={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] b={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<a.length;i++){
            while(num>=a[i]){
                num=num-a[i];
                s.append(b[i]);
            }
        }
        return s.toString();
    }
}