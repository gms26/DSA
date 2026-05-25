// Last updated: 5/25/2026, 11:07:33 AM
class Solution {
    public int fib(int n) {
          if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
        
    }
}