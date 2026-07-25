// Last updated: 7/25/2026, 10:11:58 AM
class Solution {
    public int maxProduct(int n) {
        int z=0,c=0;
       // ArrayList<Integer>a=new ArrayList<>();
        while(n>0){
            int x=n%10;
           // a.add(x);
            if(z<x){c=z;z=x;}
            else if(c<x)c=x;
            n/=10;
        }
        return z*c;
        // Collections.sort(a);
        // return a.get(a.size()-1)*a.get(a.size()-2);
    }
}