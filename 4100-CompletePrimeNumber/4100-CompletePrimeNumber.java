// Last updated: 8/10/2026, 12:11:42 PM
class Solution {
    public boolean completePrime(int num) {
       int x=num;
       int d=1;
        if(!prime(num)){
            return false;
        }
       while(d<=x)d*=10;
       d/=10;
       while(d>0){
        if(!prime(num/d))return false;
        if(!prime(x%(d*10)))return false;
        d/=10;
       }
        return true;
        
        }

    public boolean prime(int x) {
       // boolean f=true;
        if (x < 2)
            return  false;
        else {
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

