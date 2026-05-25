// Last updated: 5/25/2026, 11:04:53 AM
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer>h=new HashSet<>();
         for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && i!=k){
                        if(digits[i]!=0 && digits[k]%2==0){
                            int digit=100*digits[i]+10*digits[j]+digits[k];
                            h.add(digit);
                        }
                    }
                }
            }
         }
         int[] a=new int[h.size()];
         int j=0;
         for(int i:h){
            a[j++]=i;
         }
         Arrays.sort(a);
         return a;
    }
}