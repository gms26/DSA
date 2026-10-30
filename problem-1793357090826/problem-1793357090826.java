// Last updated: 10/30/2026, 4:14:50 PM
1class Solution {
2    public int hIndex(int[] c) {
3        int l=0,h=c.length;
4        while(l<h){
5            int mid=l+(h-l)/2;
6
7            if(c[mid]>=c.length-mid){
8                h=mid;
9            }
10            else{
11                l=mid+1;
12            }
13        }
14        return c.length-l;
15    }
16}