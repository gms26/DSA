// Last updated: 5/25/2026, 11:11:11 AM
class Solution {
    public int sum(int n){
        int a=0,b=0;
        while(n>0){ 
        a=n%10;
        n=n/10;
        b+=a*a;} return b;}
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(true){
            n=sum(n);
        if(n==1)
        return true;
        if(s.contains(n))
          return false;
        s.add(n);
        }
      
        
    
    

    }
}