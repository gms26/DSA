// Last updated: 8/10/2026, 12:26:23 PM
class Solution {
    public int maxProfit(int[] prices) {
        int sellone=0;
        int holdone=Integer.MIN_VALUE;
        int selltwo=0;
        int holdtwo=Integer.MIN_VALUE;
        for(int price:prices){
            selltwo=Math.max(selltwo,holdtwo+price);
            holdtwo=Math.max(holdtwo,sellone-price);
            sellone=Math.max(sellone,holdone+price);
            holdone=Math.max(holdone,-price);
        }
        return selltwo;
    }
}