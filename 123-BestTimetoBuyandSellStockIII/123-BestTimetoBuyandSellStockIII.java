// Last updated: 5/26/2026, 12:21:27 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int sellone=0;
4        int holdone=Integer.MIN_VALUE;
5        int selltwo=0;
6        int holdtwo=Integer.MIN_VALUE;
7        for(final int price:prices){
8            selltwo=Math.max(selltwo,holdtwo+price);
9            holdtwo=Math.max(holdtwo,sellone-price);
10            sellone=Math.max(sellone,holdone+price);
11            holdone=Math.max(holdone,-price);
12        }
13        return selltwo;
14    }
15}