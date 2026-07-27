// Last updated: 7/27/2026, 1:51:00 PM
1class Solution {
2    public boolean completePrime(int num) {
3       int x=num;
4       int d=1;
5        if(!prime(num)){
6            return false;
7        }
8       while(d<=x)d*=10;
9       d/=10;
10       while(d>0){
11        if(!prime(num/d))return false;
12        if(!prime(x%(d*10)))return false;
13        d/=10;
14       }
15        return true;
16        
17        }
18
19    public boolean prime(int x) {
20       // boolean f=true;
21        if (x < 2)
22            return  false;
23        else {
24            for (int i = 2; i * i <= x; i++) {
25                if (x % i == 0) {
26                    return false;
27                }
28            }
29        }
30        return true;
31    }
32}
33
34